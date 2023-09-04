package com.example.calculator.operators;

import com.example.calculator.operands.Operand;

public interface Operator {
    String operate(Operand... operands);

    static Operator of(String str) {
        return switch (str) {
            case "+" -> new Addition();
            case "-" -> new Subtraction();
            case "*" -> new Multiplication();
            case "/" -> new Division();
            default -> new Unknown(str);
        };
    }
}








