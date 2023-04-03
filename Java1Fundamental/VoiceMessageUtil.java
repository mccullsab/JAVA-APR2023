import java.util.*;

public class VoiceMessageUtil{
    public String greetMessage(){
        Date currentTime = new Date();
        return "Hi! It is " + currentTime ;
    }

    public String greetMessage(String name){
        return "Hi, "+ name;
    }

    public String greetMessage(String name, int age){
        return "Hi, "+ name + " who is " + age + " years old.";
    }

    public String greetMessage(int count){
        return "Hi for "+ count + " times";
    }

    // 7. for-loop 
    // enhanced for-loop
    public void printArray(String[] arr){
        for(String element : arr){
            System.out.println(element);
        }
    }

    // traditional for-loop
    public void printArray(int[] arr){
        for(int i=0; i< arr.length; i++){
            arr[i]++;
            System.out.println(arr[i]);
        }
    }

    public void printArray(ArrayList<String> arr){
        for(int i=0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }

}