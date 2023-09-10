package com.example.calculator;

import com.example.calculator.operands.Operand;
import com.example.calculator.operators.Operator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OperatorTest {

    @Test
    void testAdd() {
        assertEquals("102.00", Operator.of("+").operate(Operand.of("100"), Operand.of("2")).toString());
    }

    @Test
    void testSubtraction() {
        assertEquals("0.60", Operator.of("-").operate(Operand.of("2"), Operand.of("1.4")).toString());
        assertEquals("1.00", Operator.of("-").operate(Operand.of("2"), Operand.of("1")).toString());
        assertEquals("2.00", Operator.of("-").operate(Operand.of("2")).toString());
    }

    @Test
    void testMultiplication() {
        assertEquals("6.00", Operator.of("*").operate(Operand.of("2.0"), Operand.of("3.0")).toString());
    }

    @Test
    void testDivision() {
        assertEquals("3.00", Operator.of("/").operate(Operand.of("6"), Operand.of("2.0")).toString());
        assertEquals("6.00", Operator.of("/").operate(Operand.of("6")).toString());
    }

    @Test
    void testUnknown() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Operator.of("?").operate(Operand.of("1"), Operand.of("2"));
        });
        assertEquals("Unknown operator ?", exception.getMessage());
    }
}
