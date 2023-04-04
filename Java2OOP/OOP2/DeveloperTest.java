public class DeveloperTest{
    public static void main(String[] args){
        System.out.println("------Developer Test-------");
        Developer dev1 = new Developer("Pepper");
        dev1.displayInfo();

        Developer dev2 = new Developer();
        dev2.addLanguage("Python");
        dev2.addLanguage("JavaScript");
        dev2.displayInfo();
        dev2.coding().coding().coding();
        dev2.displayInfo();

    }
}