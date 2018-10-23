package com.revature.Launchers;

import com.revature.beans.Person;

public class PassByValueLauncher {
	public static void main(String[] args) {
		PassByValueLauncher launcher = new PassByValueLauncher();
		
		Person p = new Person("Blake", "Kruppa");
		int i = 5;
		launcher.m1(i);
		System.out.println(i);
		launcher.m2(p);
		System.out.println(p.getLastName());
	}
	
	public void m1(int i) {
		i++;
		System.out.println(i);
	}
	
	public void m2(Person p) {
		p.setLastName("test");
		System.out.println(p.getLastName());
	}
}
