import java.util.ArrayList;
public class Developer{
    // 1.  attributes/ member variables
    public String name;
    public ArrayList<String> languages = new ArrayList<String>();
    public int happiness;
    public int health;
    public double salary;

    // methods
    public void displayInfo(){
        System.out.println("----- Developer Info----");
        System.out.println("Name: "+ name);
        System.out.println("Happiness: "+ happiness);
        System.out.println("Health: "+ health);
        System.out.println("Salary: "+ salary);
        System.out.println("Languages: "+ languages);        
    }
}