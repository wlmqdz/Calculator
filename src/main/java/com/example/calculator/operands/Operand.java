package com.example.calculator.operands;

public interface Operand {

    double getValue();

    String toString();

    static Operand of(String str) {
        str = str.replaceAll(",", "");
        return new DoubleOperand(str);
    }

    static Operand of(double value) {
        return new DoubleOperand(value);
    }
}

