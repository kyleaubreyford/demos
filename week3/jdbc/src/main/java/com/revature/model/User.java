package com.revature.model;

import java.util.List;

public class User {
	private int id;
	private String name;
	private int age;
	private List<Fruit> favoriteFruits;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String name, int age, List<Fruit> favoriteFruits) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.favoriteFruits = favoriteFruits;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Fruit> getFavoriteFruits() {
		return favoriteFruits;
	}

	public void setFavoriteFruits(List<Fruit> favoriteFruits) {
		this.favoriteFruits = favoriteFruits;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((favoriteFruits == null) ? 0 : favoriteFruits.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (age != other.age)
			return false;
		if (favoriteFruits == null) {
			if (other.favoriteFruits != null)
				return false;
		} else if (!favoriteFruits.equals(other.favoriteFruits))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", favoriteFruits=" + favoriteFruits + "]";
	}

}
