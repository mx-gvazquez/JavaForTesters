import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorDemoTest {

    @BeforeEach
    void setUp() {
    }



    @Test
    public void addTest() {
        CalculatorDemo calculatorDemo = new CalculatorDemo(); //Create Object
        double result = calculatorDemo.add(1.2, 1.3); // Get sum of two numbers
        Assertions.assertEquals(2.6, result, "Calculator sum is not Expected"); // Verify the sum is correct
    }

    @Test
    void times() {
        CalculatorDemo calculatorDemo = new CalculatorDemo(); //Create Object
        double result = calculatorDemo.times(1.3, 2); // Get sum of two numbers
        Assertions.assertEquals(2.6, result, "Calculator multiplication is not Expected"); // Verify the sum is correct
    }

    @AfterEach
    void tearDown() {
    }

}