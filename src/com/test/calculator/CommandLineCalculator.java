package com.test.calculator;

import java.util.Arrays;
import java.util.Scanner;

public class CommandLineCalculator extends BaseCalculator {

    public CommandLineCalculator() {
        addArithmeticOperation(new DivisionOperation());
        addArithmeticOperation(new SquareRootOperation());
    }

    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in);

        for (; ; ) {
            System.out.println("Enter command!");
            String[] tokens = scanner.nextLine().split(" ");
            String command = tokens[0];
            try {
                ArithmeticOperation operation = getArithmeticOperationByCommand(command);
                if (operation == null) {
                    System.err.println("Invalid Operation!");
                    continue;
                }
                Double[] operands = parseOperands(Arrays.copyOfRange(tokens, 1, tokens.length));
                if (!operation.operandsValid(operands)) {
                    System.err.println("Operands invalid!");
                    continue;
                }
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
