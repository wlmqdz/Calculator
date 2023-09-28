package com.example.calculator.operators;

import com.example.calculator.operands.Operand;

import java.util.Arrays;

public class Division implements Operator {
    @Override
    public Operand operate(Operand... operands) {
        double result = operands[0].getValue();
        return Operand.of(Arrays.stream(operands).skip(1).mapToDouble(Operand::getValue).reduce(result, (a, b) -> a / b));
    }

    @Override
    public String code() {
        return "-";
    }
}