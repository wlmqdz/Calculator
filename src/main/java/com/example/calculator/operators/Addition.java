package com.example.calculator.operators;

import com.example.calculator.operands.DoubleOperand;
import com.example.calculator.operands.IntegerOperand;
import com.example.calculator.operands.Operand;

import java.util.Arrays;

public class Addition implements Operator {
    @Override
    public String calculate(Operand... operands) {
        boolean isDouble = Arrays.stream(operands).anyMatch(operand -> operand instanceof DoubleOperand);
        double result = 0.0;
        for (Operand opr : operands) {
            if (opr instanceof DoubleOperand) {
                result += ((DoubleOperand) opr).value;
            } else if (opr instanceof IntegerOperand) {
                result += ((IntegerOperand) opr).value;
            }
        }
        return isDouble ? Double.toString(result) : Integer.toString((int) result);
    }
}