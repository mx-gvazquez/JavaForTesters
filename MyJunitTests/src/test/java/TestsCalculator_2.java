import org.junit.jupiter.api.*;


/**
 * Clase tipo 'Test' para probar los métodos de la Clase 'CalculatorDemo'
 * Anotaciones básicas '@Test' con instancia de Clase en cada prueba.
 * <p>
 * Se agregan anotaciones '@BeforeEach' para mejorar el código eliminando
 * la necesidad de poner en cada prueba la intancia de la clase probada.
 * <p>
 * Las demás anotaciones '@AfterEach' son para demostrar que se ejecuta
 * después de cada '@Test'
 * <p>
 * Las anotaciones '@BeforeAll' y '@AfterAll' son las únicas tipo STATIC
 * y se ejecutan una sóla vez.
 *
 * @author German Vazquez
 */
public class TestsCalculator_2 {

    /**
     * Movemos la variable a nivel clase para que esté disponible
     * para todos los métodos. De momento solo la inicializamos.
     * Se realiza la asignación en cada uno de los '@Test', el
     * objetivo es que precisamente, esta misma variable esté disponible
     * para todos los métodos de esta clase.
     * Se restringe su acceso a únicamente esta clase con el modificador 'PRIVATE'
     */
    private CalculatorDemo calculadora;

    @BeforeAll
    public static void setupClass() {
        System.out.println("'@BeforeAll' - Se ejecuta UNA vez antes de TODO");
    }

    /**
     * Anotación 'BeforeEach' oara quitar de cada 'Test' la siguiente línea de código:
     * <p>
     *  CalculatorDemo calculadora = new CalculatorDemo();
     * <p>
     * La variable calculadora, se eleva a variable de Clase para que esté disponible
     * en todos los métodos, por eso se declara justo al inicio de la Clase, pero
     * antes de cada método. Es dentro de esta clase que se inicializa.
     * Y sencillamente se usa dentro de cada 'Test'
     *
     * @author German Vazquez
     */
    @BeforeEach
    public void setup() {
        System.out.println("    '@BeforeEach' Se ejecuta ANTES de cada Test");
        calculadora = new CalculatorDemo(); // Se ejecuta antes de cada uno de los Test.
    }

    /**
     * Anotación 'Test' para el método de SUMA de la clase CalculatorDemo
     *
     * @author German Vazquez
     */
    @Test
    public void addTest() {
    //    CalculatorDemo calculadora = new CalculatorDemo();
        System.out.println("        '@Test' - Se corre el método 'addTest' para probar la SUMA");
        double resultado = calculadora.add(1.2, 1.3);
        Assertions.assertEquals(2.5, resultado, "  <**> Algo malio sal en la SUMA<**>  ");
    }

    /**
     * Anotación 'Test' para el método de MULTIPLICACIÓN de la clase CalculatorDemo
     *
     * @author German Vazquez
     */
    @Test
    public void timesTest() {
    //    CalculatorDemo calculadora = new CalculatorDemo();
        System.out.println("        '@Test' - Se corre el método 'timesTest' de la MULTIPLICACIÓN");
        double resultado = calculadora.times(2.5, 2);
        Assertions.assertEquals(5, resultado, "  <**> Algo malio sal en la MULTIPLICACIÓN<**>  ");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("    '@AfterEach' Se ejecuta DESPUÉS de cada test");
    }

    @AfterAll
    public static void tearDownClass() {
        System.out.println("'@After.All' - Se ejecuta UNA vez después de TODO");
    }
}
