package com.heidichen.interfacedemo;

public interface Keepable {
	
	public default void play() {
		System.out.println("Chasing something...Playing.....");
	}
	
	abstract void begForFood();
	
	abstract void showAffection();
	
	
}
