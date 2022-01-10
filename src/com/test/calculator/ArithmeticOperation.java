package com.test.calculator;

/**
 * Represents an arithmetic operation
 */
public interface ArithmeticOperation {
    /**
     * Returns the count of required operators
     * @return the count
     */
    int getOperandCount();

    /**
     * Returns the trigger keyword that needs to be used to trigger this operation
     * @return the trigger
     */
    String getTrigger();

    /**
     * Checks if the provided operands are valid
     * @param operands the operands to check
     * @return true if the operands are valid, false otherwise
     */
    boolean operandsValid(Double[] operands);

    /**
     * Conducts the calculation
     * @param operands the operands
     * @return the result of the operation
     */
    Double calculate(Double[] operands);
}
