

public class ClassDemo {
        public int number = 5; // Not 'static', can be different value inside INSTANCES.
        public static String text = "Some text";   // STATIC variable belongs to CLASS, same for ALL instances.

            public void printNumber(){   // PUBLIC
                System.out.println("The number is " + number);
            }

            public static void printText(){   // PUBLIC
                System.out.println("The text is " + text);
            }

    }
