
public class WhileLoop {
    public static void main(String[] args) {

        // WHILE
        byte i = 0;
        while (i < 5) {
            System.out.println(i);
            i++; // Break condition, to avoid infinite Loop.
        }

        System.out.println("---------------");

        //DO WHILE
        do {
            System.out.println(i);
            i--;
        } while (i > 0);

    }
}
