public class DeveloperTest{
    public static void main(String[] args){
        System.out.println("------Developer Test-------");
        Developer dev1 = new Developer();
        dev1.name = "Pepper";
        dev1.happiness= 10;
        dev1.health= 10;
        dev1.salary = -100;
        dev1.languages.add("Cat");

        dev1.displayInfo();
    }
}