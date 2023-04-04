import java.util.ArrayList;
public class Developer{
    // 1. private attributes/ member variables
    private String name;
    private ArrayList<String> languages;
    private int happiness;
    private int health;
    private double salary;
    private static int devCount;
    private static double totalSalary;
    private static int totalLanguages;


    // 2. constructors
    public Developer(){ // zero-argument constructor
        this.name="Anonymous Developer";
        this.languages = new ArrayList<String>();
        this.happiness = 10;
        this.health = 10;
        this.salary = 100000;
        devCount++;
        totalSalary += this.salary;
    }


    public Developer(String name){
        this.name= name;
        this.languages = new ArrayList<String>(); 
        this.happiness = 11;
        this.health = 9;
        this.salary = 120000;
        devCount++;
        totalSalary += this.salary;
    }


    public Developer(String name, int health, int happiness, double salary) {
        this.name = name;
        this.languages = new ArrayList<String>();
        this.health = health;
        this.happiness = happiness;
        this.salary = salary;
        devCount++;
        totalSalary += this.salary;
    }


    // 3. public getter /setters
    // getter: return, no parameters      getName 
    public String getName(){
        return this.name;
    }

    // setter: no return, with parameter
    public void setName(String name){
        this.name = name;
    }

    public ArrayList<String> getLanguages(){
        return this.languages;
    }

    public void setLanguages(ArrayList<String> languages){
        this.languages = languages;
    }

    public int getHappiness(){
        return this.happiness;
    }

    public void setHappiness(int happiness){
        this.happiness = happiness;
    }

    public int getHealth(){
        return this.health;
    }

    public void setHealth(int health){
        this.health = health;
    }        

    public double getSalary(){
        return this.salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }    

    public static int getDevCount(){
        return devCount;
    }

    public static void setDevCount(int devCount){
        Developer.devCount = devCount;
    }

    public static double getTotalSalary(){
        return totalSalary;
    }


// 4 other methods
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

    public Developer raiseSalary(double raise){
        this.salary += raise;
        totalSalary += raise;
        System.out.println("Raising salary for "+this.name);
        return this;
    }

    
}