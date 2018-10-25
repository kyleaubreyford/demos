package com.revature.launchers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import com.revature.beans.Dog;
import com.revature.beans.Pet;
import com.revature.beans.Snake;

public class CollectionsLauncher {
	public static void main(String[] args) {
		List<Pet> myPets = new LinkedList<>();
		myPets.add(new Dog("Bruce", 3, 3, "Chihuaua"));
		myPets.add(new Snake("Monty", 1, 2, true, "Python"));
		myPets.add(myPets.get(0));
		System.out.println(myPets.get(0).getName());
		System.out.println(myPets);

		Set<Pet> samePets = new HashSet<>(myPets);
		samePets.add(new Snake("Monty", 1, 2, true, "Python"));
		System.out.println("set of pets");
		for (Pet p : samePets) {
			System.out.println(p);
		}

		Queue<Pet> lineOfPets = new LinkedList<>(myPets);
		System.out.println(lineOfPets.poll().getName());
		System.out.println(lineOfPets.poll().getName());

		
		Map<String, Pet> pets = new HashMap<>();
		pets.put("Jose", new Snake("Rudalf", 2, 3, true, "Reindeer"));
		pets.put("Calvin", new Dog("Dinner", 4, 3, "Malteese"));

		System.out.println(pets.get("Calvin").getName());
		
		
		for (String key : pets.keySet()) {
			System.out.println(pets.get(key).getName());
		}

	}
}
