package com.example.calculator;

import com.example.calculator.operands.Operand;
import com.example.calculator.operators.Operator;

public class Calculator {

    public Calculator() {
    }

    public String calculate(String input) {
        String[] inputArr = input.split(" ");
        if (inputArr.length == 3) {
            return Operator.of(inputArr[1]).operate(Operand.of(inputArr[0]), Operand.of(inputArr[2]));
        } else {
            return "Operand Operation Operand";
        }
    }
}
