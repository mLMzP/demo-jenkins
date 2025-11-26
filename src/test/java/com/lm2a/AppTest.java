package com.lm2a;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {

    // Instantiate the Calculator object
    Calculator calculator = new Calculator();

    // Test for the add method
    @Test
    public void testAdd() {
        int result = calculator.add(2, 3); // Calls the add method
        assertEquals(5, result);  // Verifies if 2 + 3 equals 5
    }

    // Test for the subtract method
    @Test
    public void testSubtract() {
        int result = calculator.subtract(5, 3); // Calls the subtract method
        assertEquals(2, result);  // Verifies if 5 - 3 equals 2
    }

    // Test for the multiply method
    @Test
    public void testMultiply() {
        int result = calculator.multiply(5, 3); // Calls the subtract method
        assertEquals(15, result);  // Verifies if 5 - 3 equals 2
    }

    @Test
    public void testDivide() {
        float result = calculator.divide(6, 3);
        assertEquals(2, result);
    }

}
