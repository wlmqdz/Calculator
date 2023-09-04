package com.example.calculator.operators;

import com.example.calculator.operands.DoubleOperand;
import com.example.calculator.operands.IntegerOperand;
import com.example.calculator.operands.Operand;

import java.util.Arrays;

public class Division implements Operator {
    @Override
    public String calculate(Operand... operands) {
        boolean isDouble = Arrays.stream(operands).anyMatch(operand -> operand instanceof DoubleOperand);
        double result = operands[0] instanceof DoubleOperand ? ((DoubleOperand) operands[0]).value : ((IntegerOperand) operands[0]).value;
        for (int i = 1; i < operands.length; i++) {
            Operand opr = operands[i];
            if (opr instanceof DoubleOperand) {
                result /= ((DoubleOperand) operands[i]).value;
            } else if (opr instanceof IntegerOperand) {
                result /= ((IntegerOperand) operands[i]).value;
            }
        }
        return isDouble ? Double.toString(result) : Integer.toString((int) result);
    }
}