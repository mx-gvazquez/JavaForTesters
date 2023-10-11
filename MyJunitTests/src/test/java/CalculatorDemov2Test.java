import org.junit.jupiter.api.*;

class CalculatorDemov2Test {

    private CalculatorDemo calculatorDemo; //We make a Class Level variable, for this instance, so
                                            //it can be used in every TEST method.

    @BeforeAll
    public static void setupClass() {
        System.out.println("Set up Class");
    }

    @BeforeEach
    public void setup() {
        System.out.println("Set up Test");
        calculatorDemo = new CalculatorDemo(); //Create an Instance
    }



    @Test
    public void addTest() {
    //     CalculatorDemo calculatorDemo = new CalculatorDemo(); //Create Object
        double result = calculatorDemo.add(1.2, 1.3); // Get sum of two numbers
        Assertions.assertEquals(2.6, result, "Calculator sum is not Expected"); // Verify the sum is correct
    }

    @Test
    void times() {
    //     CalculatorDemo calculatorDemo = new CalculatorDemo(); //Create Object
        double result = calculatorDemo.times(1.3, 2); // Get multiplication of two numbers
        Assertions.assertEquals(2.6, result, "Calculator multiplication is not Expected"); // Verify the multiplication is correct
    }

    @AfterEach
    public void teardown() {
        System.out.println("Teardown Test");
        calculatorDemo = new CalculatorDemo(); //Create an Instance
    }

    @AfterAll
    public static void teardownClass() {
        System.out.println("Teardown Class");
    }
}