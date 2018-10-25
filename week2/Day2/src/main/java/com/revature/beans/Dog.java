package com.revature.beans;

public class Dog extends Pet implements Comparable<Dog> {
	private String breed;

	public Dog() {
		super();
	}

	public Dog(String name, int legs, int age, String breed) {
		super(name, legs, age);
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((breed == null) ? 0 : breed.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (breed == null) {
			if (other.breed != null)
				return false;
		} else if (!breed.equals(other.breed))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dog [breed=" + breed + ", toString()=" + super.toString() + "]";
	}

	@Override
	public String getName() {
		return "I'm a dog, my name is " + super.getName();
	}

	@Override
	public void play() {
		System.out.println("Playing fetch with " + super.getName());
	}

	@Override
	public int compareTo(Dog o) {
		return this.getBreed().compareTo(o.getBreed());
	}

}
