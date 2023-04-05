package com.heidichen.interfacedemo;

public class Cat extends Pet implements Keepable{

	public Cat() {
		super("Cat");
		this.setName("A random cat");
	}
	
	public void begForFood() {
		System.out.println("Meowwwwwwww");
	}
	
	public void showAffection() {
		System.out.println("Slap the owner...");
	}

}
