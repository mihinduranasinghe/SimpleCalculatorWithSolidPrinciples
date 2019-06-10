package com.company.v6.operation;

import java.util.List;

public class OperationFactory {
    public Operation getInstance(String operator, List<Double> inputNumbers){

        Operation operation = null;
        if ("add".equals(operator)) {
            operation = new AddOperation(inputNumbers.get(0), inputNumbers.get(1));
        } else if ("sub".equals(operator)) {
            operation = new SubOperation(inputNumbers.get(0), inputNumbers.get(1));
        } else if ("mul".equals(operator)) {
            operation = new MulOperation(inputNumbers.get(0), inputNumbers.get(1));
        } else if ("div".equals(operator)) {
            operation = new DivOperation(inputNumbers.get(0), inputNumbers.get(1));
        }

        return operation;

    }
}
