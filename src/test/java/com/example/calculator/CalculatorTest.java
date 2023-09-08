package com.example.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testAdd() {
        assertEquals("3.00", new Calculator().calculate("1 + 2"));
    }

    @Test
    void testSubtraction() {
        assertEquals("1.00", new Calculator().calculate("2 - 1"));
    }

    @Test
    void testMultiplication() {
        assertEquals("6.00", new Calculator().calculate("2 * 3"));
    }

    @Test
    void testDivision() {
        assertEquals("3.00", new Calculator().calculate("6 / 2"));
    }

    @Test
    void testInvalidInput() {
        assertEquals("Operand Operation Operand", new Calculator().calculate("6 / "));
        assertEquals("Operand Operation Operand", new Calculator().calculate("6 / 2 3"));
    }
}
