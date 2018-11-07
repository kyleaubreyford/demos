package com.revature.services;

import java.util.List;

import com.revature.model.Champion;

public interface ChampionService {
	ChampionService currentImplementation = new ChampionServiceImpl();
	
	Champion findById(int id);
	Champion findByName(String name);
	
	List<Champion> findAll();
	List<Champion> findAllByRole(String role);
	
	int save(Champion newChampion);
	
}
