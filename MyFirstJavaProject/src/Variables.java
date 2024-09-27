public class Variables {

    public static void main(String[] args) {
        System.out.println("Hello German!");

        int myFirstVariable; // Declare variable
        myFirstVariable = 5; // Initialize Variable

        System.out.println(myFirstVariable);    // Instance variable in Print command
        System.out.println("myFirstVariable");  // Print String text

        String name = "German"; // Initialize String variable
        String textToPrint = "Favorite number of " + name + " is: " + myFirstVariable; // Create chained String
        System.out.println(textToPrint); // Instance composed String variable
    }
}
