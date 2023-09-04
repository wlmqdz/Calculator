package com.example.calculator.operators;

import com.example.calculator.operands.DoubleOperand;
import com.example.calculator.operands.IntegerOperand;
import com.example.calculator.operands.Operand;

import java.util.Arrays;

public class Multiplication implements Operator {
    @Override
    public String operate(Operand... operands) {
        boolean isDouble = Arrays.stream(operands).anyMatch(operand -> operand instanceof DoubleOperand);
        double result = 1.0;
        for (int i = 0; i < operands.length; i++) {
            Operand opr = operands[i];
            if (opr instanceof DoubleOperand) {
                result *= ((DoubleOperand) operands[i]).value;
            } else if (opr instanceof IntegerOperand) {
                result *= ((IntegerOperand) operands[i]).value;
            }
        }
        return isDouble ? Double.toString(result) : Integer.toString((int) result);
    }
}