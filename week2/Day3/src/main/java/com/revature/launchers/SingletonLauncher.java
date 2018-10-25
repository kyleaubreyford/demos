package com.revature.launchers;

import com.revature.beans.Singleton;

public class SingletonLauncher {

	public static void main(String[] args) {
		Singleton s = Singleton.INSTANCE;
		s.saveUser();
	}
}
