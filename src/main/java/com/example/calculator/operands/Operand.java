package com.example.calculator.operands;

public interface Operand {

    double getValue();

    static Operand of(String str) {
        str = str.replaceAll(",", "");
        return new DecimalOperand(str);
    }

    static Operand of(double value) {
        return new DecimalOperand(value);
    }
}

