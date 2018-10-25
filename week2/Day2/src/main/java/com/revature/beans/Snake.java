package com.revature.beans;

public class Snake extends Pet {
	private boolean isVenomous;
	private String species;

	public Snake() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Snake(String name, int legs, int age, boolean isVenomous, String species) {
		super(name, legs, age);
		this.isVenomous = isVenomous;
		this.species = species;
	}

	public boolean isVenomous() {
		return isVenomous;
	}

	public void setVenomous(boolean isVenomous) {
		this.isVenomous = isVenomous;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isVenomous ? 1231 : 1237);
		result = prime * result + ((species == null) ? 0 : species.hashCode());
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
		Snake other = (Snake) obj;
		if (isVenomous != other.isVenomous)
			return false;
		if (species == null) {
			if (other.species != null)
				return false;
		} else if (!species.equals(other.species))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Snake [isVenomous=" + isVenomous + ", species=" + species + "]";
	}

	@Override
	public void play() {
		System.out.println("Holding the snake " + super.getName());
	}

}
