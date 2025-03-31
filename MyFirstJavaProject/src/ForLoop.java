

public class ForLoop {
    public static void main(String[] args) {
        for (byte i = 0; i < 10; i++) {
            System.out.println(i); // 0 to 9, since 10 is not less than 10, loop ends.
        }

        System.out.println("---------------");


        byte pages = 12;
        for (byte j = 0; j <= pages; j++) {
            System.out.println(j); // Now we run through all 0 to 'pages'.
        }

        System.out.println("---------------");

        String[] students = {"Dimitry", "Olga", "Roman", "Xavier", "Anastasia"};

//We declared 'pupil' as a String incremental 1 by 1 value, to run the FOR Loop

        for (String pupil : students) {
            System.out.println(pupil);
        }

    }
}
