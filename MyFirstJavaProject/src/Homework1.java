

public class Homework1 {
    public static void main(String[] args) {
        // Given int number
        int x = 23;
        // Using IF ELSE statement, write a program that will

        //Print "Negative" if the number is negative
        //boolean isNegative = x < 0; //This was eliminated because Boolean is used only ONCE.
        //if (isNegative){
        if (x < 0) {
            System.out.println("Negative");
        }
        //Print "Zero" if number is zero
        if (x == 0) {
            System.out.println("Zero");
        }
        //Print "Small" if number is 10 or less
        if (x > 0 && x <= 10) {
            System.out.println("Small");
        }
        //Print "Less than 100" if number is less than 100
        if (x > 0 && x < 100) {
            System.out.println("Less than 100");
        }
        //Print "Too big" if number is 100 or more
        if (x >= 100) {
            System.out.println("Too big");
        }
        //Print "Jordan" if number is 100 or more
        if (x == 23) {
            System.out.println("Jordan");
        }

    }
}
