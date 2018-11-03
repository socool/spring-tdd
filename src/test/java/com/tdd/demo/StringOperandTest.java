package com.tdd.demo;

import org.junit.Assert;
import org.junit.Test;

public class StringOperandTest {

    @Test
    public void getOneShouldValid(){
        StringOperand stringOperand = new StringOperand(1);
        Assert.assertEquals("One",stringOperand.toString());
    }
}
