package com.revature.dao;

import java.util.List;

import com.revature.model.Champion;

public interface ChampionDao {
	ChampionDao currentImplementation = new ChampionDaoJdbc();
	
	Champion findById(int id);
	Champion findByName(String name);
	
	List<Champion> findAll();
	List<Champion> findAllByRole(String role);
	
	int save(Champion newChampion);
	
}
