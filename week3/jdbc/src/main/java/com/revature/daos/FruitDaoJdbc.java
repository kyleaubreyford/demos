package com.revature.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.revature.model.Fruit;
import com.revature.util.ConnectionUtil;

public class FruitDaoJdbc implements FruitDao {
//	private String dataSource = "jdbc:postgresql://uta-1810.cixj48tduq7e.us-west-2.rds.amazonaws.com:5432/uta_1810?user=postgres&password=bondstone";

	@Override
	public Fruit findByName(String name) {
//		try (Connection conn = DriverManager.getConnection(dataSource)) {
		try (Connection conn = ConnectionUtil.getConnection()) {
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery(
				"SELECT * FROM fruit WHERE UPPER(name) = '" + name.toUpperCase() + "'"
			);
			
			if (rs.next()) {
				return new Fruit(rs.getInt("id"), rs.getString("name"), rs.getString("color"), rs.getInt("flavorrating"));	
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Fruit> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Fruit f) {
//		try (Connection conn = DriverManager.getConnection(dataSource)) {
		try (Connection conn = ConnectionUtil.getConnection()) {
			PreparedStatement ps = conn.prepareStatement(
				"INSERT INTO fruit (name, color, flavorrating) VALUES (?, ? ,?)"
				, new String[] {"id"} // not required but if you want to get a value generated
									// by the db you need to specify the columns you want to view
			);
			ps.setString(1, f.getName());
			ps.setString(2, f.getColor());
			ps.setInt(3, f.getFlavorRating());
			ps.executeUpdate();
			ResultSet rs = ps.getGeneratedKeys(); // get a rs containing the columns for the record inserted based off string array above
			if (rs.next()) {
				int id = rs.getInt("id");
				f.setId(id);
				return id;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}
