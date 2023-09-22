public class Homework3 {
    public static void main(String[] args) {
        // Write a loop, to print numbers in descending order
        // starting from 50 and with a step of 5, not 1.
        // End the loop at 0.

        byte cuenta = 50;

        do {
            System.out.println(cuenta);
            cuenta -= 5;
        } while (cuenta >= 0);

        System.out.println("---------------");

        for (int i = 50; i >= 0 ; i -= 5) {
            System.out.println(i);
        }


    }
}
