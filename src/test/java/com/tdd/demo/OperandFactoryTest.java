package com.tdd.demo;

import org.junit.Assert;
import org.junit.Test;

public class OperandFactoryTest {
    @Test
    public void pattern1GetLeftShouldBeStringOperand(){
        Assert.assertTrue(OperandFactory.getLeft(1,1) instanceof StringOperand);
    }

    @Test
    public void pattern2GetLeftShouldBeIntegerOperand(){
        Assert.assertTrue(OperandFactory.getLeft(2,1) instanceof IntegerOperand);
    }

    @Test
    public void pattern1GetRightShouldBeIntegerOperand(){
        Assert.assertTrue(OperandFactory.getRight(1,1) instanceof IntegerOperand);
    }

    @Test
    public void pattern2GetRightShouldBeIntegerOperand(){
        Assert.assertTrue(OperandFactory.getRight(2,1) instanceof StringOperand);
    }
}
