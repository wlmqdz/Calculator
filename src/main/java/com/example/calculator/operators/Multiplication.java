package com.example.calculator.operators;

import com.example.calculator.operands.Operand;

import java.util.Arrays;

public class Multiplication implements Operator {
    @Override
    public Operand operate(Operand... operands) {
        return Operand.of(Arrays.stream(operands).mapToDouble(Operand::getValue).reduce(1.0, (a, b) -> a * b));
    }
}