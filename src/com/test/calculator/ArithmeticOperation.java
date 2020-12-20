package com.test.calculator;

public interface ArithmeticOperation {
    int getOperandCount();
    String getTrigger();
    boolean operandsValid(Double[] operands);
    Double calculate(Double[] operands);
}
