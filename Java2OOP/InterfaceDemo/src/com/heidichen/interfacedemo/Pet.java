package com.heidichen.interfacedemo;

public class Pet {
	// 1. attributes
	private String name;
	private String type;
	
	// 2. constructors
	public Pet() {
		this.name = "A random pet";
		this.type = "Unknown";
	}
	
	public Pet(String type) {
		this.name = "A random pet";
		this.type = type;
	}

	// 3. getters/setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	// other methods
    public void display() {
		System.out.println("------- DISPLAY ---------");
		System.out.println("Name: " + this.name);
		System.out.println("Type: " + this.type);
	}	
	

}
