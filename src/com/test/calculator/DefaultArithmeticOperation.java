package com.test.calculator;

public abstract class DefaultArithmeticOperation implements ArithmeticOperation {
    @Override
    public boolean operandsValid(Double[] operands) {
        return getOperandCount() == operands.length;
    }
}
