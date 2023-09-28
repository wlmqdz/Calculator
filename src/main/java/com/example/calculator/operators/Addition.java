package com.example.calculator.operators;

import com.example.calculator.operands.Operand;

import java.util.Arrays;

public class Addition implements Operator {
    @Override
    public Operand operate(Operand... operands) {
        return Operand.of(Arrays.stream(operands).mapToDouble(Operand::getValue).sum());
    }

    @Override
    public String code() {
        return "+";
    }
}