package com.heidichen.inheritancedemo;

public class FrontendDeveloper extends Developer{
	// attributes
	private boolean isArtistic;
	
	// constructor 
	public FrontendDeveloper() {
		super("Anonymous Frontend developer");
		this.addLanguage("css");
		this.addLanguage("sass");
	}

	public FrontendDeveloper(String name, int happiness, int health, double salary) {
		super(name, happiness, health, salary);
		this.isArtistic = true;
		this.addLanguage("css");
		this.addLanguage("sass");
		this.addLanguage("js");
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
        System.out.println("Artistic?: "+ this.isArtistic);
	}

	public FrontendDeveloper usingEyeDrops() {
		this.setHealth(this.getHealth()+1); 
		System.out.println(this.getName() + " is using eyedrops");
		return this;
	}
	
	public FrontendDeveloper styling() {
		this.happiness++;
		System.out.println(this.getName() + " is styling");
		return this;
	}
	
}
