package com.tdd.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class OperatorTest {
    @Test
    public void itShouldBePlus(){
        Operator operator = new Operator(1);
        Assert.assertEquals("+",operator.toString());
    }

    @Test
    public void itShouldBeMultiply(){
        Operator operator = new Operator(2);
        Assert.assertEquals("*",operator.toString());
    }

    @Test
    public void itShouldBeMinus(){
        Operator operator = new Operator(3);
        Assert.assertEquals("-",operator.toString());
    }

    @Test
    public void itShouldBeDevide(){
        Operator operator = new Operator(4);
        Assert.assertEquals("/",operator.toString());
    }
}
