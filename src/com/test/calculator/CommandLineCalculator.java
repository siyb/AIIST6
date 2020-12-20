package com.test.calculator;

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
                Double[] operands = parseOperands(tokens);
                if (!operation.operandsValid(operands)) {
                    System.err.println("Operands invalid!");
                    continue;
                }
                double result = operation.calculate(operands);
                System.out.println("The result of this operation is " + result);
            } catch (RuntimeException e) {
                scanner.close();
                return;
            }
        }
    }
}
