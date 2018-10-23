package com.revature.Launchers;

import java.util.Arrays;

public class ArrayLauncher {
	public static void main(String[] args) {
		int[] numbers = new int[5];
		numbers[0] = 0;
		numbers[1] = -1;
		numbers[3] = 12;
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println("with for each loop");
		// enhanced for loop, for each loop
		for (int each: numbers) {
			System.out.println(each);
		}
		
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}
}
