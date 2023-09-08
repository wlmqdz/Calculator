package com.example.calculator.operators;

import com.example.calculator.operands.Operand;

public class Unknown implements Operator {
    private String str;

    public Unknown(String str) {
        this.str = str;
    }

    @Override
    public Operand operate(Operand... operands) {
        throw new IllegalArgumentException("Unknown Operator doesn't support operate");
    }
}