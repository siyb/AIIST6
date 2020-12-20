package com.test.calculator;

public class DivisionOperation extends DefaultArithmeticOperation implements ArithmeticOperation {
    @Override
    public int getOperandCount() {
        return 2;
    }

    @Override
    public String getTrigger() {
        return "divide";
    }

    @Override
    public Double calculate(Double[] operands) {
        return operands[0] / operands[1];
    }

    @Override
    public boolean operandsValid(Double[] operands) {
        return super.operandsValid(operands) && operands[1] != 0.0;
    }
}
