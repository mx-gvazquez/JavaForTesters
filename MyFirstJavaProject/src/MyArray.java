

public class MyArray {
    public static void main(String[] args) {
        //    String[] students;
        String[] students = {"Roco", "Tico", "Maco", "Paco"};

        //    int[] numbers;
        int[] numbers = {1, 3, 5, 8, 13, 21};

        System.out.println(students[0]); // Imprime el primer valor del arreglo.

        System.out.println(students[1]); // Imprime el valor del arreglo en el Indice '1'.
        students[0] = "Ester"; // Cambia el valor del arreglo en el Indice '0'.

        System.out.println("Hay " + students.length + " alumnos en la clase"); //Concatenación de arreglos.

/*
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
 */

        for (String pupil : students) {  //Método FOR nuevo
            System.out.println(pupil);
        }

    }
}
