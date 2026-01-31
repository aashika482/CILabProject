package com.muj.ci;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CalculatorTest {
    @Test
    public void testAddition() {
        Calculator calc = new Calculator();
        assertEquals("The addition test failed.", 3, calc.add(1, 2));
    }
    @Test
    public void testSubtraction() {
        Calculator calc = new Calculator();
        assertEquals("The subtraction test failed.", 3, calc.subtract(5, 2));
    }
}