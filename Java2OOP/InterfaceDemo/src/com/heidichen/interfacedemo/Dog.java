package com.heidichen.interfacedemo;

public class Dog extends Pet implements Keepable{

	public Dog() {
		super("Dog");
		this.setName("A random dog");
	}

	@Override
	public void begForFood() {
		System.out.println("Staring at you.....");		
	}

	@Override
	public void showAffection() {
		System.out.println("Wagging tails");
		
	}



}
