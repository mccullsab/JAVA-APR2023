package com.heidichen.inheritancedemo;

public class BackendDeveloper extends Developer {

	public BackendDeveloper() {
		super("Anonymous backend developer");
		this.addLanguage("SQL");
		this.addLanguage("Python");
	}

	public BackendDeveloper(String name) {
		super(name);
		this.addLanguage("SQL");
		this.addLanguage("Python");
		// TODO Auto-generated constructor stub
	}

	public BackendDeveloper(String name, int happiness, int health, double salary) {
		super(name, happiness, health, salary);
		this.addLanguage("SQL");
		this.addLanguage("Python");
		// TODO Auto-generated constructor stub
	}

}

