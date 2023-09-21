public class DataTypesDemo {
    public static void main(String[] args) {

        /* PRIMITIVE DATA TYPES */
        boolean myBoolean = true;
        char myChar = 'A';

        /* INTEGER */
        byte myByte = 50;
        short myShort = 30000;
        int myInt = 2000000000; /* 9 zeros */
        long myLong = 1000000000000000000L; /* for Long Literals,  18 zeros + L */

        /* FLOATING */
        float myFloat = 3.14f;
        double myDouble = 3.14;


        // Data type casting - Widening - byte -> int
        int newInt = myByte; // newInt es ahora un ENTERO con el valor de myByte (50)
        System.out.println(newInt);

        // Data type casting - Narrowing - double -> int
        int newIntFromDouble = (int) myDouble;
        System.out.println(newIntFromDouble); // El resultado pasa de 3.14 a 3.

    }
}