package com.revature.model;

public class Fruit {
	private int id;
	private String name;
	private String color;
	private int flavorRating;

	public Fruit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fruit(int id, String name, String color, int flavorRating) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.flavorRating = flavorRating;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getFlavorRating() {
		return flavorRating;
	}

	public void setFlavorRating(int flavorRating) {
		this.flavorRating = flavorRating;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + flavorRating;
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
		Fruit other = (Fruit) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (flavorRating != other.flavorRating)
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
		return "Fruit [id=" + id + ", name=" + name + ", color=" + color + ", flavorRating=" + flavorRating + "]";
	}

}
