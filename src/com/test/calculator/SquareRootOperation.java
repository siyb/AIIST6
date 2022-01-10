package com.test.calculator;

/**
 * A sqrt operation
 */
public class SquareRootOperation extends DefaultArithmeticOperation implements ArithmeticOperation {
    /**
     * Sqrt only has a single operand
     * @return the operand count
     */
    @Override
    public int getOperandCount() {
        return 1;
    }

    /**
     * Registers the "sqrt" trigger with the calculator
     * @return the trigger
     */
    @Override
    public String getTrigger() {
        return "sqrt";
    }

    /**
     * Conducts the sqrt operation
     * @param operands the operands
     * @return the sqrt result
     */
    @Override
    public Double calculate(Double[] operands) {
        return Math.sqrt(operands[0]);
    }

    /**
     * Checks if the correct number of operands was provided and that the operand is not a negative value
     * @param operands the operands to check
     * @return the result of the sqrt operation
     */
    @Override
    public boolean operandsValid(Double[] operands) {
        return super.operandsValid(operands) && operands[0] >= 0;
    }
}
