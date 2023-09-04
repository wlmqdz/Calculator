package com.example.calculator.operands;

public class DoubleOperand implements Operand {

    public final double value;

    public DoubleOperand(String str) {
        this.value = Double.parseDouble(str);
    }
}
