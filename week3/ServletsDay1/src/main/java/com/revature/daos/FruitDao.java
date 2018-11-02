package com.revature.daos;

import java.util.List;

import com.revature.model.Fruit;

public interface FruitDao {
	FruitDao currentImplementation = new FruitDaoJdbc();

	Fruit findByName(String name);

	List<Fruit> findAll();

	int save(Fruit f);
}
