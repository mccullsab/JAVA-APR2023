package com.heidichen.interfacedemo;

public class PetTest {

	public static void main(String[] args) {
		Cat cat1 = new Cat();
		Dog dog1 = new Dog();
		
		cat1.display();
		dog1.display();
		cat1.play();
		cat1.begForFood();
		
		dog1.begForFood();
		cat1.showAffection();
		dog1.showAffection();

	}

}
