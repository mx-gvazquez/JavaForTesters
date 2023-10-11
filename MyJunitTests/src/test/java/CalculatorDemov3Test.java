import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class CalculatorDemov3Test {

    private CalculatorDemo calculatorDemo; //We make a 'Class Level variable', for this 'instance', so
    //it can be used in every TEST method.

        @BeforeAll
            public static void setupClass() {
                System.out.println("Set up Class");
        }

        @BeforeEach
            public void setup() {
                System.out.println("Set up Test");
                calculatorDemo = new CalculatorDemo(); // From the 'Class Level variable' we Create an 'Instance'
        }

        //Parameterized Test,  'Data Provider' (hard coded)
        public static double[][] data() {       //Array of arrays, Data source of 'double' type variables.
            return new double[][]{{0, 1, 1}, {-1.5, 1.5, 0}, {2.5, 3.6, 6.1}};
        }

        @ParameterizedTest
            @MethodSource(value = "data")
            public void addTest(double[] data) {
            Assertions.assertEquals(data[2], calculatorDemo.add(data[0], data[1]), "Calculator sum is not Expected"); // Verify the sum is correct
        }

    /*
        @ParameterizedTest
        @MethodSource(value = "data")
        public void addTest(double[] data) {
            double a = data[0];
            double b = data[1];
            double expected = data[2];

            double result = calculatorDemo.add(a, b); // Get sum of two numbers
            Assertions.assertEquals(expected, result, "Calculator sum is not Expected"); // Verify the sum is correct
        }
        */


    //    @Disabled("Test deshabilitado por que no hemos terminado el Data Provider")
        @Test
        void times() {

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