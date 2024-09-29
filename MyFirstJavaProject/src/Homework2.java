package MyFirstJavaProject.src;

public class Homework2 {
    public static void main(String[] args) {
    // Using Switch statement, print day of the week, depending on a dat number from 1 to 7.
        byte dia = 8;
        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número de día incorrecto, recuerde, la semana no tiene: " + dia + " días. " +
                        "\n     Se espera un número entre 1 y 7.");
        }
    }
}
