package com.revature.daos;

import java.util.List;

import com.revature.model.User;

public interface UserDao {
	public static final  UserDao currentImplementation = new UserDaoJdbc();
	
	User findById(int id);

	List<User> findAll();

	List<User> findByAgeBetween(int lower, int upper);

	/**
	 * Save a new user
	 * 
	 * @param u the user we want to save
	 * @return the id generated
	 */
	int save(User u);

	void update(User u);
}
