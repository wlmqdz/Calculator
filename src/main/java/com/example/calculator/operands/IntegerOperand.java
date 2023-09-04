package com.example.calculator.operands;

public class IntegerOperand implements Operand {

    public final int value;

    public IntegerOperand(String str) {
        this.value = Integer.parseInt(str);
    }
}
