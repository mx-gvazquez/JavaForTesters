package MyFirstJavaProject.src;

public class JavaMethodsFull {

    public static void main(String[] args) {
        System.out.println("------------------------------------------------------");
        helloWorld();
        name();
        printHello("German");
        printHello("Gustavo");
        printHello("Antonio");
        suma((byte) 5, (byte) 6);
        suma((byte) 7, (byte) 7);
        age("German", (byte) 38);
        age("Alexandra", 36); //Tipo 'Int' consume mas memoria, pero es mas sencillo de implementar.
        suma(3, 3);
        suma(3, 6, 9);
        suma(3.5, 7.3);
        System.out.println(square(11));
        System.out.println("------------------------------------------------------");
    }

    private static void helloWorld() {
        System.out.println("Hello, world!");
    }

    private static void name() {
        System.out.println("Hello, Dmitry!");
    }

    private static void printHello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method overloading
    private static void suma(byte a, byte b) {
        byte sum = (byte) (a + b);
        System.out.println(sum);
    }

    private static void suma(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    private static void suma(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println(sum);
    }

    private static void suma(double a, double b) {
        double sum = a + b;
        System.out.println(sum);
    }

    private static void age(String name, byte years) {
        System.out.println(name + " is " + years + " years old.");
    }


    private static void age(String name, int years) {
        System.out.println(name + " is " + years + " years old.");
    }

// RETURN

    private static int square(int i) {
        //  int cuadrado = i * i;
        //  return cuadrado;
        return i * i; // Mejora de IntelliJ
    }


}
