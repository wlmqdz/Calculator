package com.example.calculator;

import com.example.calculator.operands.Operand;
import com.example.calculator.operators.Operators;

public class Calculator {

    public String calculate(String input) {
        String[] inputArr = input.split(" ");
        if (inputArr.length == 3) {
            return Operators.of(inputArr[1]).operate(Operand.of(inputArr[0]), Operand.of(inputArr[2])).toString();
        } else {
            return "Operand Operation Operand";
        }
    }
}
