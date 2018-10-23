package com.revature.Launchers;

import com.revature.beans.Person;

public class ScopesLauncher {
	public static void main(String[] args) {
		
		Person an = new Person("An", "Ta");
		System.out.println(Person.getNumberPeople());
		Person clark = new Person("Clark", "Bode");
//		System.out.println(an.getFirstName());
		System.out.println(clark.getFirstName());
		System.out.println(Person.getNumberPeople());
	}
}
