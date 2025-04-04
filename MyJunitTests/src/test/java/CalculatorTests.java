import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTests {

    /**
    * Movemos la variable a nivel clase para que esté disponible
    * para todos los métodos. De momento solo la creamos.
     */
    private CalculatorDemo calculadora;

    @BeforeAll
    public static void setupClass() {
        System.out.println("Se ejecuta UNA vez antes de TODO");
    }

    @BeforeEach
    public void setup() {
        System.out.println("Se ejecuta ANTES de cada Test");
        calculadora = new CalculatorDemo(); // Se ejecuta antes de cada uno de los Test.
    }

    /**
     * Test del método de SUMA de la clase CalculatorDemo
     *
     * @author German Vazquez
     */
    @Test
    public void addTest() {
        // CalculatorDemo calculadora = new CalculatorDemo();
        System.out.println("Se corre el TEST de la SUMA");
        double resultado = calculadora.add(1.2, 1.3);
        Assertions.assertEquals(2.4, resultado, "  <**> Algo malio sal en la SUMA<**>  ");
    }

    /**
     * Test del método de MULTIPLICACIÓN de la clase CalculatorDemo
     *
     * @author German Vazquez
     */
    @Test
    public void timesTest() {
        // CalculatorDemo calculadora = new CalculatorDemo();
        System.out.println("Se corre el TEST de la MULTIPLICACIÓN");
        double resultado = calculadora.times(2.5, 2);
        Assertions.assertEquals(5, resultado, "  <**> Algo malio sal en la MULTIPLICACIÓN<**>  ");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Se ejecuta DESPUÉS de cada test");
    }

    @AfterAll
    public static void tearDownClass() {
        System.out.println("Se ejecuta UNA vez después de TODO");

    }

}
