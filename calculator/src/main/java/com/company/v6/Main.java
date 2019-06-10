package com.company.v6;

import com.company.v6.input.CMDLineInputs;
import com.company.v6.input.Inputs;
import com.company.v6.operation.*;
import com.company.v6.output.ConsoleOutput;
import com.company.v6.output.Outputs;
import com.company.v6.repository.FIleNumberRepository;
import com.company.v6.repository.NumberRepository;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Inputs inputs = new CMDLineInputs(args);
        String operator = inputs.read();

        NumberRepository numberRepository = new FIleNumberRepository();
        List<Double> inputNumbers = numberRepository.read();

        OperationFactory operationFactory=new OperationFactory();
        Operation operation= operationFactory.getInstance(operator,inputNumbers);


        Outputs outputs = new ConsoleOutput();
        outputs.show("The result is: " + operation.perform());
        outputs.show("Exiting the program....");
    }

}
