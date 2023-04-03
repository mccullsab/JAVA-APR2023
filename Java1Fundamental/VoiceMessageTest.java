import java.util.ArrayList;


public class VoiceMessageTest{
    public static void main(String[] args){
        VoiceMessageUtil newBot = new VoiceMessageUtil();
        System.out.println(newBot.greetMessage());
        System.out.println(newBot.greetMessage("Pepper"));
        System.out.println(newBot.greetMessage("Pepper", 14));
        System.out.println(newBot.greetMessage(13));

    // 5. Casting (implicit & explicit, Null VALUE)
    // int --> double (no loss of data)
        int age = 14;
        double doubleAge = age;
        System.out.println(doubleAge);

        // double--> int (explicit casting: loss of data)
        double requiredTime = 1.5;
        int intRequiredTime = (int) requiredTime;
        System.out.println(intRequiredTime);

        // fixed array
        int[] messagesPerDay = new int[3];
        messagesPerDay[0] = 5;
        messagesPerDay[1] = 2;
        int[] messagesPerDay2 = { 5, 8, 6};

        String[] messages = { "Please call back!", 
            "Make sure you install jdk", 
            "Do not install VS code exztension"};

        newBot.printArray(messages);
        newBot.printArray(messagesPerDay);

        // Dynamic ArrayList
        ArrayList<String> reminders = new ArrayList<>();
        reminders.add("DO NOT INSTALL VS CODE EXTENSION");
        reminders.add("Stay hydrated!!");
        reminders.add("A little bit of code and test it!");
        reminders.add("Remind Shawn to give some jokes");
        reminders.set(3, "Use dark mode on the replit");
        System.out.println(reminders);

        newBot.printArray(reminders);

    }
}