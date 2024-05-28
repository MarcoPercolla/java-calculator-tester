package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void testAdd() {

        assertEquals(5.0, Calculator.add(2.0f, 3.0f), 0.0001);
        assertEquals(-1.0, Calculator.add(-2.0f, 1.0f), 0.0001);
    }

    @Test
    void testSubtract() {

        assertEquals(-1.0, Calculator.subtract(2.0f, 3.0f), 0.0001);
        assertEquals(-3.0, Calculator.subtract(-2.0f, 1.0f), 0.0001);
    }

    @Test
    void testDivide() {

        assertEquals(2.0, Calculator.divide(6.0f, 3.0f), 0.0001);
        assertEquals(-2.0, Calculator.divide(-6.0f, 3.0f), 0.0001);
    }

    @Test
    void testDivideByZero() {

        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(1.0f, 0.0f));
    }

    @Test
    void testMultiply() {

        assertEquals(6.0, Calculator.multiply(2.0f, 3.0f), 0.0001);
        assertEquals(-2.0, Calculator.multiply(-2.0f, 1.0f), 0.0001);
    }
}