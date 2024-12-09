package MyFirstJavaProject.src;

public class Homework1Sol {
    public static void main(String[] args) {
        // Given int number
        int x = 99;
/*
        // Using IF ELSE statement, write a program that will
        //Print "Negative" if the number is negative
        //Print "Zero" if number is zero
        //Print "Small" if number is 10 or less
        //Print "Less than 100" if number is less than 100
        //Print "Too big" if number is 100 or more
        //Print "Jordan" if number is 100 or more
*/
        if (x < 0) {
            System.out.println("Negative");
        } else if (x == 0) {
            System.out.println("Zero");
        } else if (x <= 10) {
            System.out.println("Small");
        } else if (x != 23 && x < 100) {
            System.out.println("Less than 100");
        } else if (x == 23) {
            System.out.println("Jordan");
        } else {
            System.out.println("Too big");
        }

    }
}
