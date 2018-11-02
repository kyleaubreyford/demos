package com.revature.services;

import java.util.List;

import com.revature.daos.FruitDao;
import com.revature.model.Fruit;

public class FruitServiceImpl implements FruitService {
	private FruitDao fd = FruitDao.currentImplementation;

	@Override
	public List<Fruit> findAll() {
		return fd.findAll();
	}

	@Override
	public int save(Fruit f) {
		return fd.save(f);
	}

}
