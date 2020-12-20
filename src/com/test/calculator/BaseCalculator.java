package com.test.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class BaseCalculator {
    private List<ArithmeticOperation> arithmeticOperations = new ArrayList<>();

    protected void addArithmeticOperation(ArithmeticOperation a) {
        arithmeticOperations.add(a);
    }

    protected Double[] parseOperands(String[] stringOperands) {
        return Arrays.stream(stringOperands)
                .map(s -> Double.parseDouble(s))
                .toArray(Double[]::new);
    }
}
