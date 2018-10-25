package com.revature.launchers;

import com.revature.beans.Dog;
import com.revature.beans.Pet;
import com.revature.util.Kennel;

public class InheritanceLauncher {
	public static void main(String[] args) {
		Pet d = new Dog("spike", 4, 3, "Doberman");
		System.out.println(d.getName());
		
		Kennel k = new Kennel();
		k.entertainPet(d);
	}
	

}
