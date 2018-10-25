package com.revature.launchers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.revature.beans.Dog;
import com.revature.util.DogNameComparator;

public class ComparisonLauncher {
	public static void main(String[] args) {
		List<Dog> dogs = new ArrayList<>();
		dogs.add(new Dog("Sparky", 4, 1, "Schnauzer"));
		dogs.add(new Dog("Joe", 2, 26, "The Big Red Dog"));
		dogs.add(new Dog("Max", 4, 3, "Basset Hound"));
		dogs.add(new Dog("Dinner", 3, 4, "Malteese"));
		dogs.add(new Dog("Wishbone", 4, 3, "Jack Russel Terrier"));
		dogs.add(new Dog("Clifford", 4, 1, "The Big Red Dog"));

		System.out.println("before sorting");
		for (Dog d : dogs) {
			System.out.println(d);
		}

//		Collections.sort(dogs);
//		dogs.sort(new DogNameComparator());
		dogs.sort((d1, d2) -> {
			return d1.getAge() - d2.getAge();
		});
		System.out.println("after sorting");
		dogs.forEach(d -> {
			System.out.println(d);
		});
	}
}
