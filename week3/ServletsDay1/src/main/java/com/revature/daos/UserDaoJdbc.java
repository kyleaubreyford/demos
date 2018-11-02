package com.revature.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.revature.model.Fruit;
import com.revature.model.User;
import com.revature.util.ConnectionUtil;

public class UserDaoJdbc implements UserDao {
//	private String dataSource = "jdbc:postgresql://uta-1810.cixj48tduq7e.us-west-2.rds.amazonaws.com:5432/uta_1810?user=postgres&password=bondstone";
	private Logger log = Logger.getRootLogger();
	
	@Override
	public User findById(int id) {
		// Try with resources will automatically close my connection after the try-catch block
//		try (Connection conn = DriverManager.getConnection(dataSource)) {
		try (Connection conn = ConnectionUtil.getConnection()) {
			log.debug("finding user with the id " + id);
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery(
					"SELECT user_id, fruit_id, u.name as user_name, f.name as fruit_name, " + 
					" 	age, color, flavorrating FROM users u " + 
					"INNER JOIN users_fruit uf " +
					"ON u.id = uf.user_id " +
					"INNER JOIN fruit f " + 
					"ON uf.fruit_id = f.id " +
					"WHERE u.id = " + id);
			
			if(rs.next()) {
				log.trace("user found with id " + id + " attempting to extract result set");
				User u = new User(rs.getInt("user_id"), rs.getString("user_name"), rs.getInt("age"), new ArrayList<>());
				do {
					u.getFavoriteFruits().add(new Fruit(rs.getInt("fruit_id"), rs.getString("fruit_name"),
								rs.getString("color"), rs.getInt("flavorrating")));
				} while (rs.next());

				return u;
			} else {
				log.debug("no users found with the id " +id);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findByAgeBetween(int lower, int upper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(User u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update(User u) {
		// TODO Auto-generated method stub

	}

}
