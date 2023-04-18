# Welcome to the JAVA stack with Heidi

## Instructions
1. Clone the repo to your computer
2. Pull the repo when you want to get the latest update of the code

## Eclipse Shortcut
| Windows | Mac    | Functions |
|----------------- | -----------------| --------------|
| Alt + Shift S  | Command + Option+ S| Open Source to create getter/setter|
| Ctrl + Shift+ O  | Command + Shift +O | Autoimport |
| Ctrl + Shift + T | Command + Shift + T| Open / Search for types, very useful in finding classes|
| Alt + up/down | Option + up/down | Move the line up / down |
| Ctrl + Shift + F| Command + Shift + F | Auto-format | 
|Alt + Shift + R|Command + Option + R|Rename of package, class etc|


## Common errors

### To kill a running port
1. run the first command to get the PID of the port
2. kill the port with the PID. 

    #### **Mac/Linux**
    - to getting the background process and find the PID
    ```lsof -i:8080 ```

    - To kill the PID
    ```kill -9 <PID> ```

    #### **Windows**
    - to getting the background process and find the PID
    ```netstat -ano | findstr :8080```
    - To kill the PID
    ```taskkill /PID <PID> /F ```

## Extra Resources
1. W1D1: [Listing all methods in a class](#fundamentals--listing-all-the-methods-in-a-class)
2. W1D1: [Using .map in Java](#fundamentals--map-in-java)


### Fundamentals : Listing all the methods in a class
1. Import the method at the top
```import java.lang.reflect.Method;```

2. Declare a Class and you can use the built-in methods in Class. 
    ```java
        Class<VoiceMessageUtil> cls = VoiceMessageUtil.class;
        Method[] methods = cls.getDeclaredMethods(); 
        // getMethods() read also the built-in methods
        for (Method method : methods) {
            if (java.lang.reflect.Modifier.isStatic(method.getModifiers())) {
                // This is a static method
                System.out.println("Static method: " + method.getName());
            } else {
                // This is an instance method
                System.out.println("Instance method: " + method.getName());
            }
        }
    ```
Resources: 
 https://www.tutorialspoint.com/get-the-list-of-all-the-public-methods-in-java
 
Documentation of Class https://www.javatpoint.com/java-class

### Fundamentals : .map in Java 

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapJava {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squares = numbers.stream()
                                        .map(n -> n * n)
                                        .collect(Collectors.toList());
        System.out.println(squares); // prints [1, 4, 9, 16, 25]
    }
}
```

Reference: https://www.geeksforgeeks.org/stream-map-java-examples/