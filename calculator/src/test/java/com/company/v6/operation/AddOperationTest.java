package com.company.v6.operation;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class AddOperationTest {
    @Test
    public void AddPositiveToPositiveTest(){
        Operation operation=new AddOperation(2,3);
        double result = operation.perform(); //5.0
        assertThat(result, is(5.0));

        }

    @Test
    public void AddPositiveToZeroTest(){
        Operation operation=new AddOperation(2,0);
        double result = operation.perform(); //5.0
        assertThat(result, is(2.0));

    }
    }
