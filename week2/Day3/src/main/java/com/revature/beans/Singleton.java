package com.revature.beans;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class Singleton {
	private Logger log = Logger.getRootLogger();
	
	private List<String> users = new ArrayList<>();

	public static final Singleton INSTANCE = new Singleton();

	private Singleton() {
		super();
	}
	
	public void saveUser() {
		log.info("saving new user");
	}

}
