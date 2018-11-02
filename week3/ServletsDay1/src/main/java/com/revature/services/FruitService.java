package com.revature.services;

import java.util.List;

import com.revature.model.Fruit;

public interface FruitService {
	FruitService currentImplementation = new FruitServiceImpl();

	List<Fruit> findAll();

	int save(Fruit f);
}
