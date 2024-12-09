package MyFirstJavaProject.src;

public class Homework4 {
    public static void main(String[] args) {

        //Write a loop, that will replace all characters 'o' with '0'

        String str = "Hello world!";
        String newStr = "";      // Arreglo vacío, sin tamaño definido.

        byte i = 0;
        while (i < str.length()) {
            char x = str.charAt(i);
            if (x == 'o') {
                newStr = newStr + 0;
            } else {
                newStr = newStr + x;
            }
            i++;
        }

        System.out.println(newStr);

    }
}
