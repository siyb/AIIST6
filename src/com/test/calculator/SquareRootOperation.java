package com.test.calculator;

public class SquareRootOperation extends DefaultArithmeticOperation implements ArithmeticOperation {
    @Override
    public int getOperandCount() {
        return 1;
    }

    @Override
    public String getTrigger() {
        return "sqrt";
    }

    @Override
    public Double calculate(Double[] operands) {
        return Math.sqrt(operands[0]);
    }
}
