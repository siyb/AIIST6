package com.test.calculator;

/**
 * A division
 */
public class DivisionOperation extends DefaultArithmeticOperation implements ArithmeticOperation {
    /**
     * We only support 2 parameters for divisions
     * @return 2
     */
    @Override
    public int getOperandCount() {
        return 2;
    }

    /**
     * Divisions trigger when "divide" is typed
     * @return 2
     */
    @Override
    public String getTrigger() {
        return "divide";
    }

    /**
     * Conducts the actual division
     */
    @Override
    public Double calculate(Double[] operands) {
        return operands[0] / operands[1];
    }

    /**
     * Checks if the amount of parameters is correct and if the second parameter is not null
     * @param operands the operands to check
     * @return false if the parameter count is wrong or the divisor is 0
     */
    @Override
    public boolean operandsValid(Double[] operands) {
        return super.operandsValid(operands) && operands[1] != 0.0;
    }
}
