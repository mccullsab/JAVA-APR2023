package com.heidichen.inheritancedemo;

public class DeveloperTest {

	public static void main(String[] args) {
        System.out.println("------Developer Test-------");
        Developer dev1 = new Developer("Pepper");
        dev1.displayInfo();
        
        Developer dev2 = new Developer();
        dev2.addLanguage("Python");
        dev2.addLanguage("JavaScript");
        dev2.displayInfo();
        dev2.coding().coding().coding();
        dev2.displayInfo();

        FrontendDeveloper dev3 = new FrontendDeveloper();
        
        dev3.coding().coding().displayInfo();
        
        FrontendDeveloper dev4 = new FrontendDeveloper("Josh", 10, 10, 200000);
        
        dev4.displayInfo();
        
        dev4.usingEyeDrops().usingEyeDrops().displayInfo();
        dev4.styling().displayInfo();
        
        BackendDeveloper dev5 = new BackendDeveloper();
        dev5.coding().coding().displayInfo();
        
	}

}
