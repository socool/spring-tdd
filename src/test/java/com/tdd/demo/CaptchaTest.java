package com.tdd.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CaptchaTest {
    private int operatorDummy = 1;
    private int rightDummy = 1;
    private int leftDummy = 1;

    @Test
    public void firstPatternLeftOperandShouldBeOne(){
        Captcha captcha = new Captcha(1,1,operatorDummy,rightDummy);
        String expected = captcha.getLeft();
        Assert.assertEquals("One",expected);
    }

    @Test
    public void firstPatternLeftOperandShouldBeNine(){
        Captcha captcha = new Captcha(1,9,operatorDummy,rightDummy);
        String expected = captcha.getLeft();
        Assert.assertEquals("Nine",expected);
    }

    @Test
    public void firstPatternLeftOperandShouldBeFive(){
        Captcha captcha = new Captcha(1,5,operatorDummy,rightDummy);
        String expected = captcha.getLeft();
        Assert.assertEquals("Five",expected);
    }

    @Test
    public void firstPatternRightOperandShouldBeOne(){
        Captcha captcha =new Captcha(1,leftDummy,operatorDummy,1);
        String expected = captcha.getRight();
        Assert.assertEquals("1",expected);
    }

    @Test
    public void firstPatternRightOperandShouldBeNine(){
        Captcha captcha = new Captcha(1,leftDummy,operatorDummy,9);
        String expected = captcha.getRight();
        Assert.assertEquals("9",expected);
    }

    @Test
    public void firstPatternRightOperandShouldBeFive(){
        Captcha captcha = new Captcha(1,leftDummy,operatorDummy,5);
        String expected = captcha.getRight();
        Assert.assertEquals("5",expected);
    }

    @Test
    public void firstPatternOperatorShouldBePlus(){
        Captcha captcha = new Captcha(1,leftDummy,1,rightDummy);
        String expected = captcha.getStringOperator();
        Assert.assertEquals("+",expected);
    }

    @Test
    public void firstPatternOperatorShouldBeMultiply(){
        Captcha captcha = new Captcha(1,leftDummy,2,rightDummy);
        String expected = captcha.getStringOperator();
        Assert.assertEquals("*",expected);
    }
}
