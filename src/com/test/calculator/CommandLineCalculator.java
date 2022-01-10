package com.test.calculator;

import java.util.Arrays;
import java.util.Scanner;

/**
 * The CommandLineCalculator implementation allow basic calculations on the command line
 */
public class CommandLineCalculator extends BaseCalculator {

    /**
     * Construct a calculator that supports divisions and squareroots
     */
    public CommandLineCalculator() {
        addArithmeticOperation(new DivisionOperation());
        addArithmeticOperation(new SquareRootOperation());
    }

    /**
     * Continuously reads, parses and conducts calculations
     */
    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in);

        for (; ; ) { // forever loop
            System.out.println("Enter command!");
            String[] tokens = scanner.nextLine().split(" ");
            String command = tokens[0];
            try {
                // get the actual operation by the input command
                ArithmeticOperation operation = getArithmeticOperationByCommand(command);
                if (operation == null) {
                    System.err.println("Invalid Operation!");
                    continue;
                }
                // parse all operands to doubles
                Double[] operands = parseOperands(Arrays.copyOfRange(tokens, 1, tokens.length));
                if (!operation.operandsValid(operands)) {
                    System.err.println("Operands invalid!");
                    continue;
                }
                // conduct calculation
                double result = operation.calculate(operands);
                System.out.println("The result of this operation is " + result);
            } catch (RuntimeException e) {
                System.out.println(e);
                scanner.close();
                return;
            }
        }
    }
}
