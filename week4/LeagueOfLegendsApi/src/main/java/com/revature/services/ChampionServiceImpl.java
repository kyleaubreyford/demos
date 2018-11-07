package com.revature.services;

import java.util.List;

import com.revature.dao.ChampionDao;
import com.revature.dao.UserDao;
import com.revature.model.Champion;

public class ChampionServiceImpl implements ChampionService{
	private ChampionDao cd = ChampionDao.currentImplementation;

	@Override
	public Champion findById(int id) {
		return cd.findById(id);
	}

	@Override
	public Champion findByName(String name) {
		return cd.findByName(name);
	}

	@Override
	public List<Champion> findAll() {
		return cd.findAll();
	}

	@Override
	public List<Champion> findAllByRole(String role) {
		return cd.findAllByRole(role);
	}

	@Override
	public int save(Champion newChampion) {
		return cd.save(newChampion);
	}

}
