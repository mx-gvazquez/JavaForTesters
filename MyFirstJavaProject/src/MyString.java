package MyFirstJavaProject.src;

public class MyString {
    public static void main(String[] args) {
        String hello = "Hola German!"; //Se declara e inicializa una variable tipo String
        System.out.println(hello); // Se instancía.
// Los datos tipo String son una clase, y pueden invocar métodos
    // Contar elementos
        int stringLength = hello.length();
        System.out.println(stringLength);
    // Texto en MAYÚSCULAS
        String helloUp = hello.toUpperCase();
        System.out.println(helloUp);
    // Texto en minúsculas
        String helloLow = hello.toLowerCase();
        System.out.println(helloLow);
    // Concatenación de variables string
        String addStrings = helloLow + helloUp;
        System.out.println(addStrings);
    // Concatenación de variables string
        String stringWithInt = hello + ", this string length is: " + stringLength;
        System.out.println(stringWithInt);
    // Saltos de línea y caracteres especiales
        String movie = "Mi película favorita es \n \"Deadpool\"";
        System.out.println(movie);
    }
}
