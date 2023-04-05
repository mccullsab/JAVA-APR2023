package com.heidichen.inheritancedemo;

import java.util.ArrayList;

public class Developer {
    // 1. private attributes/ member variables
    private String name;
    private ArrayList<String> languages;
    protected int happiness;
    private int health;
    private double salary;	
    
    //2. constructors
    public Developer(){ // zero-argument constructor
        this.name="Anonymous Developer";
        this.languages = new ArrayList<String>();
        this.happiness = 10;
        this.health = 10;
        this.salary = 100000;
    }
    
    public Developer(String name){
        this.name= name;
        this.languages = new ArrayList<String>();
        this.happiness = 11;
        this.health = 9;
        this.salary = 120000;
    }

	public Developer(String name, int happiness, int health, double salary) {
		this.name = name;
		this.happiness = happiness;
		this.health = health;
		this.salary = salary;
        this.languages = new ArrayList<String>();
	}

	
    // 3. getters/setters	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getLanguages() {
		return languages;
	}

	public void setLanguages(ArrayList<String> languages) {
		this.languages = languages;
	}

	public int getHappiness() {
		return happiness;
	}

	public void setHappiness(int happiness) {
		this.happiness = happiness;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// 4. other methods
    public void addLanguage(String language){
        this.languages.add(language);
    } 

    public void displayInfo(){
        System.out.println("----- Developer Info----");
        System.out.println("Name: "+ name);
        System.out.println("Happiness: "+ happiness);
        System.out.println("Health: "+ health);
        System.out.println("Salary: "+ salary);
        System.out.println("Languages: "+ languages);        
    }

    public Developer coding(){
        this.health--;
        this.happiness++;
        System.out.println(this.name + " is coding.... less health... more happiness");
        return this;
    }

	
    
}


