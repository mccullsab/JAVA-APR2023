// 1. compile java (javac & java)
// fileName/ className: PascalCase
// variables/methods: camelCase
// DO NOT USE snake_case
public class JavaBasic{
    public static void main(String[] args){
        // public: visible to the world
        // static: can run without instantiating
        // void : no return
        // main: name of the method of this entry point
        System.out.println("Hello World!!!!");
        // ------------- First Java Program ------------
        // 2. variables 
        // 2.1 int, double, boolean, char, String )
        // 2.2 Primitive VS Wrapper Class
        String projectTitle = "Cafe Java";
        String developer = "Heidi";
        int totalFiles = 2;
        double requiredTime = 1.5;
        char difficulty = 'B';
        boolean isDone = false;

        System.out.println("Project Title: " + projectTitle);
        System.out.println("Developer: " + developer);
        System.out.println("Total Files: " + totalFiles );
        System.out.println("Required time:" + requiredTime);
        System.out.println("difficulty: " + difficulty);

        System.out.println(Integer.MAX_VALUE);

    // 3. conditionals & ternary
        if(isDone){ // condition must be boolean
            System.out.println(projectTitle + " is completed");
        }else{
            System.out.println(projectTitle + " is NOT completed");
        }

        if(totalFiles > 1){
            System.out.println("Please zip the files before you submit");
        }else{
            System.out.println("You can submit the file without zipping it");
        }

        // Ternary operators
        System.out.println(totalFiles > 1 ? "Please zip the files before you submit!" : "You can submit the file without zipping it!");
        // ------------- Cafe Java ------------
        // 4. String (length, indexOf, format, trim(), .equals )
        System.out.println(projectTitle.length());
        System.out.println(projectTitle.indexOf("Java"));
        // .concat
        String projectDetails = projectTitle.concat("------").concat(developer);
        System.out.println(projectDetails);        
        String projectDetails2 = projectTitle + " : " + developer;
        System.out.println(projectDetails2);       

        // .format 
        String projectDetails3 = String.format("Project Title : %s | Required Time: %.2f", projectTitle, requiredTime);
        System.out.println(projectDetails3);

        // .equals
        String name1 = "Heidi";
        String name2 = "Heidi";
        String name3 = new String("Heidi");

        System.out.println(name1 == name2); // true
        System.out.println(name1 == name3); // false

        System.out.println(name1.equals(name2));
        System.out.println(name1.equals(name3) && name1.equals(name2));

    }
}





    // 5. Casting (implicit & explicit, Null VALUE)

    // the following will be demonstrated in other util & test
    // 6. dependency injection (using methods in another file) & overloading methods
    // -------------- Alfred Bot ------------------
    // 7. Fixed Array & Loops
    // 8. ArrayList

    // -------------- Cafe Business Logic --------------