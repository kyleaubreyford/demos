package com.revature.util;

import java.util.Comparator;

import com.revature.beans.Dog;

public class DogNameComparator implements Comparator<Dog> {

	@Override
	public int compare(Dog o1, Dog o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}
