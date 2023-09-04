package com.example.calculator;

import com.example.calculator.operands.Operand;
import com.example.calculator.operators.Operator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperatorTest {

    @Test
    void testAdd() {
        assertEquals("3", Operator.of("+").operate(Operand.of("1"), Operand.of("2")));
        assertEquals("3.0", Operator.of("+").operate(Operand.of("1"), Operand.of("2.0")));
    }

    @Test
    void testSubtraction() {
        assertEquals("1", Operator.of("-").operate(Operand.of("2"), Operand.of("1")));
        assertEquals("1.0", Operator.of("-").operate(Operand.of("2.0"), Operand.of("1")));
    }

    @Test
    void testMultiplication() {
        assertEquals("6", Operator.of("*").operate(Operand.of("2"), Operand.of("3")));
        assertEquals("6.0", Operator.of("*").operate(Operand.of("2.0"), Operand.of("3.0")));
    }

    @Test
    void testDivision() {
        assertEquals("3", Operator.of("/").operate(Operand.of("6"), Operand.of("2")));
        assertEquals("3.0", Operator.of("/").operate(Operand.of("6"), Operand.of("2.0")));
    }

    @Test
    void testUnknown() {
        assertEquals("Unknown operation ?", Operator.of("?").operate(Operand.of("1"), Operand.of("2")));
    }
}
