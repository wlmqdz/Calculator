package com.example.calculator.operands;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DoubleOperand implements Operand {

    private final int SCALE = 2;

    private final RoundingMode ROUNDING_MODE = RoundingMode.HALF_EVEN;

    public final BigDecimal value;

    public DoubleOperand(String input) {
        this.value = new BigDecimal(input).setScale(SCALE, ROUNDING_MODE);
    }

    public DoubleOperand(double value) {
        this.value = new BigDecimal(value).setScale(SCALE, ROUNDING_MODE);
    }

    @Override
    public double getValue() {
        return this.value.doubleValue();
    }

    @Override
    public String toString() {
        return this.value.toString();
    }
}
