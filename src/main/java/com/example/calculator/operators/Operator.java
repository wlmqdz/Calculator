package com.example.calculator.operators;

import com.example.calculator.operands.Operand;

public interface Operator {
    Operand operate(Operand... operands);
    String code();
}








