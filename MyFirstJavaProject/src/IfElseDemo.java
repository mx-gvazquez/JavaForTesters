public class IfElseDemo {
    public static void main(String[] args) {
        int x = 11;

//        boolean isTrue = x > 10; // Condition is constant, not a very good practice.
        //This was eliminated because Boolean is used only ONCE.


/*  // This answer pops a logical error with  ' x = 10 '.
    // Due to 'isTrue' condition is False, it jumps to else line.

        if (isTrue) {
            System.out.println(x + " is greater than 10");
        } else {
            System.out.println(x + " is less than 10");
        }
*/


        if (x == 10) {
            System.out.println("x is 10");
        } else if (x > 10) {
            System.out.println(x + " is more than 10");
        } else {
            System.out.println(x + " is less than 10");
        }

        boolean cold = true;
        int time = 1900;
        if (time < 1200) {
            System.out.println("Good morning");
        } else if (time >= 1200 && time < 1800) {
            System.out.println("Good afternoon");
        } else {
            if (cold) {
                System.out.println("Good evening, it's cold");
            } else {
                System.out.println("Good warm evening");
            }
        }

    }
}
