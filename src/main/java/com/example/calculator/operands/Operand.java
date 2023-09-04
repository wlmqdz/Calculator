package com.example.calculator.operands;

public interface Operand {

    static Operand of(String str) {
        str = str.replaceAll(",", "");
        return str.contains(".") ? new DoubleOperand(str): new IntegerOperand(str);
    }
}

