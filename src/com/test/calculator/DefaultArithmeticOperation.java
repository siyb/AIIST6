package com.test.calculator;

/**
 * A default {@link ArithmeticOperation}.
 */
public abstract class DefaultArithmeticOperation implements ArithmeticOperation {
    /**
     * By default, operands are validated only by their length. Can be reused by subclasses by calling the method using
     * the super keyword, see {@link DivisionOperation} or {@link SquareRootOperation} for more details.
     * @param operands the operands to check
     * @return
     */
    @Override
    public boolean operandsValid(Double[] operands) {
        return getOperandCount() == operands.length;
    }
}
