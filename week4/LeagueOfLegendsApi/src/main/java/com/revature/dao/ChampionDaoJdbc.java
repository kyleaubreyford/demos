package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.model.Champion;
import com.revature.util.ConnectionUtil;

public class ChampionDaoJdbc implements ChampionDao{
	private Champion extractFromResultSet(ResultSet rs) throws SQLException {
		return new Champion(rs.getInt("champion_id"),rs.getString("champion_name"), rs.getString("champion_role"));
	}

	@Override
	public Champion findById(int id) {
		try (Connection conn = ConnectionUtil.getConnection()) {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM champions WHERE champion_id = ?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				return extractFromResultSet(rs);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Champion findByName(String name) {
		try (Connection conn = ConnectionUtil.getConnection()) {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM champions WHERE UPPER(champion_name) = UPPER(?)");
			ps.setString(1, name);;
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				return extractFromResultSet(rs);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Champion> findAll() {
		try (Connection conn = ConnectionUtil.getConnection()) {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM champions");
			
			ResultSet rs = ps.executeQuery();
			List<Champion> champions = new ArrayList<>();
			while (rs.next()) {
				champions.add(extractFromResultSet(rs));
			}
			return champions;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Champion> findAllByRole(String role) {
		try (Connection conn = ConnectionUtil.getConnection()) {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM champions WHERE UPPER(champion_role) = UPPER(?)");
			ps.setString(1, role);
			ResultSet rs = ps.executeQuery();
			List<Champion> champions = new ArrayList<>();
			while (rs.next()) {
				champions.add(extractFromResultSet(rs));
			}
			return champions;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int save(Champion newChampion) {
		try (Connection conn = ConnectionUtil.getConnection()) {
			PreparedStatement ps = conn.prepareStatement(
				"INSERT INTO champions (champion_name, champion_role) VALUES (?, ?)"
				, new String[] {"champion_id"} // not required but if you want to get a value generated
									// by the db you need to specify the columns you want to view
			);
			ps.setString(1, newChampion.getName());
			ps.setString(2, newChampion.getRole());
			ps.executeUpdate();
			ResultSet rs = ps.getGeneratedKeys(); // get a rs containing the columns for the record inserted based off string array above
			if (rs.next()) {
				int id = rs.getInt("champion_id");
				newChampion.setId(id);
				return id;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}
