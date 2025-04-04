import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * Clase tipo 'Test' para probar los métodos de la Clase 'CalculatorDemo'
 * Anotaciones básicas '@Test' con instancia de Clase en cada prueba.
 *
 * @author German Vazquez
 */
public class TestsCalculator_1 {

    /**
     * Test del método de SUMA de la clase CalculatorDemo
     *
     * @author German Vazquez
     */
    @Test
    public void addTest() {
        CalculatorDemo calculadora = new CalculatorDemo();
        System.out.println("Se corre el TEST de la SUMA");
        double resultado = calculadora.add(1.2, 1.3);
        Assertions.assertEquals(2.5, resultado, "  <**> Algo malio sal en la SUMA<**>  ");
    }

    /**
     * Test del método de MULTIPLICACIÓN de la clase CalculatorDemo
     *
     * @author German Vazquez
     */
    @Test
    public void timesTest() {
        CalculatorDemo calculadora = new CalculatorDemo();
        System.out.println("Se corre el TEST de la MULTIPLICACIÓN");
        double resultado = calculadora.times(2.5, 2);
        Assertions.assertEquals(5, resultado, "  <**> Algo malio sal en la MULTIPLICACIÓN<**>  ");
    }

}
