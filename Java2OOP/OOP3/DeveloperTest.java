import java.util.ArrayList;
public class DeveloperTest{
    public static void main(String[] args){
        System.out.println("------Developer Test-------");
        System.out.println("Developer count: "+ Developer.getDevCount());
        System.out.println("Total salary: "+ Developer.getTotalSalary());

        Developer dev1 = new Developer("Pepper");
        dev1.displayInfo();

        Developer dev2 = new Developer();
        dev2.addLanguage("Python");
        dev2.addLanguage("JavaScript");
        dev2.displayInfo();
        dev2.coding().coding().coding().raiseSalary(500);
        dev2.displayInfo();

        System.out.println("Developer count: "+ Developer.getDevCount());

        System.out.println("Total salary: "+ Developer.getTotalSalary());
      
        
        Developer dev3 = new Developer();
        ArrayList<String> codingDojoLanguages = new ArrayList<>();
        codingDojoLanguages.add("Python");
        codingDojoLanguages.add("JavaScript");
        codingDojoLanguages.add("Java");
        dev3.setLanguages(codingDojoLanguages);
        System.out.println("Developer count: "+ Developer.getDevCount());

        System.out.println("Total salary: "+ Developer.getTotalSalary());
      

    }
}