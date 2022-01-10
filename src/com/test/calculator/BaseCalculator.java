package com.test.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The abstract calculator base class
 */
public abstract class BaseCalculator {
    /**
     * This base class handles registering and managing {@link ArithmeticOperation}s for its subclasses
     */
    private List<ArithmeticOperation> arithmeticOperations = new ArrayList<>();

    /**
     * Adds arbitrary {@link ArithmeticOperation} to the calculator's feature set
     * @param a the {@link ArithmeticOperation} to add
     */
    protected void addArithmeticOperation(ArithmeticOperation a) {
        arithmeticOperations.add(a);
    }

    /**
     * Starts up the calculator, is abstract because every calculator is started differently
     */
    public abstract void start();

    /**
     * Obtains the {@link ArithmeticOperation} by keyword, can be reused because it is the same for all implementations
     * @param command the command to be executed
     * @return the {@link ArithmeticOperation} that fits the command
     */
    protected ArithmeticOperation getArithmeticOperationByCommand(String command) {
        for (ArithmeticOperation o : arithmeticOperations) {
            if (o.getTrigger().equals(command)) {
                return o;
            }
        }
        return null;
    }

    /**
     * Parses an array of string operands to their double equivalents
     * @param stringOperands an array of operands
     * @return the double representation
     */
    protected Double[] parseOperands(String[] stringOperands) {
        return Arrays.stream(stringOperands)
                .map(s -> Double.parseDouble(s))
                .toArray(Double[]::new);
    }
}
