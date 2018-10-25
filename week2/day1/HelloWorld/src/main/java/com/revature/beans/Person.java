package com.revature.beans;

public class Person {
	private String firstName;
	private String lastName;
	private static int numberPeople = 0;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
		Person.numberPeople++;
	}

	public Person(String firstName, String lastName) {
		this();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public static int getNumberPeople() {
		return Person.numberPeople;
	}

}
