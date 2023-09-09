package com.example.calculator.operators;

import com.example.calculator.operands.Operand;

public interface Operator {
    Operand operate(Operand... operands);

    Addition addition = new Addition();
    Subtraction subtraction = new Subtraction();
    Multiplication multiplication = new Multiplication();
    Division division = new Division();

    static Operator of(String str) {
        return switch (str) {
            case "+" -> addition;
            case "-" -> subtraction;
            case "*" -> multiplication;
            case "/" -> division;
            default -> new Unknown(str);
        };
    }
}








