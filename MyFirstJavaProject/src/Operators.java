

public class Operators {
    public static void main(String[] args) {

        //Arithmetical Operators
        int a = 100;
        int b = 50;

        System.out.println(a + b); //Addition
        System.out.println(a - b); //Substraction
        System.out.println(a * b); //Multiplication
        System.out.println(a / b); //Division

        System.out.println("Add 1 to a = 100, three times in a row");

        System.out.println(++a); //Incremental 1
        System.out.println(++a); //Incremental 1
        System.out.println(++a); //Incremental  - 103

        System.out.println("Substract 1 to b = 50, three times in a row");

        System.out.println(--b); //Decremental 1
        System.out.println(--b); //Decremental 1
        System.out.println(--b); //Decremental - 47


        //Assignment Operators
        int c = 10;

        //c = c+3;
        c += 3;  // Nueva sintaxis de adición.
        System.out.println(c); // Print c = 10 + 3


        int sum = a + b + c; // Creamos una nueva variable con base en 2 anteriores (mismo tipo).
        System.out.println(sum); //103 + 47

        System.out.println("------------------");
        System.out.println("Add a + b + c is equal to: " + sum);

        System.out.println("------------------");
        System.out.println("Comparison Operators");

        //Comparison Operators, Boolean response
        System.out.println(a == b); // Is 'a' equal to 'b' ?
        System.out.println(a != b); // Is 'a' not equal to 'b' ?
        System.out.println(a > b); // Is 'a' greater than 'b' ?
        System.out.println(a < b); // Is 'a' less 'b' ?
        System.out.println(a >= b); // Is 'a' greater or equal 'b' ?
        System.out.println(a <= b); // Is 'a' less or equal 'b' ?

        //Logical Operators, Boolean response

        System.out.println("------------------");
        System.out.println("Logical Operators");

        //System.out.println(3 > 2);
        System.out.println(3 > 2 && 10 < 15); // AND Logical operator - True AND True = True
        System.out.println(3 > 2 && 10 < 9); // AND Logical operator - True AND False = False
        System.out.println(3 > 2 || 10 < 9); // AND Logical operator - True OR False = False


    }
}
