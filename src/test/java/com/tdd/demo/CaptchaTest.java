package com.tdd.demo;

import org.junit.Assert;
import org.junit.Test;
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
        Operand expected = captcha.getLeft();
        Assert.assertEquals("One",expected.toString());
    }

    @Test
    public void firstPatternLeftOperandShouldBeNine(){
        Captcha captcha = new Captcha(1,9,operatorDummy,rightDummy);
        Operand expected = captcha.getLeft();
        Assert.assertEquals("Nine",expected.toString());
    }

    @Test
    public void firstPatternLeftOperandShouldBeFive(){
        Captcha captcha = new Captcha(1,5,operatorDummy,rightDummy);
        Operand expected = captcha.getLeft();
        Assert.assertEquals("Five",expected.toString());
    }

    @Test
    public void firstPatternRightOperandShouldBe1(){
        Captcha captcha =new Captcha(1,leftDummy,operatorDummy,1);
        Operand expected = captcha.getRight();
        Assert.assertEquals("1",expected.toString());
    }

    @Test
    public void firstPatternRightOperandShouldBe9(){
        Captcha captcha = new Captcha(1,leftDummy,operatorDummy,9);
        Operand expected = captcha.getRight();
        Assert.assertEquals("9",expected.toString());
    }

    @Test
    public void firstPatternRightOperandShouldBe5(){
        Captcha captcha = new Captcha(1,leftDummy,operatorDummy,5);
        Operand expected = captcha.getRight();
        Assert.assertEquals("5",expected.toString());
    }

    @Test
    public void secondPatternLeftOperandShouldBe1(){
        Captcha captcha = new Captcha(2,1,operatorDummy,rightDummy);
        Operand expected = captcha.getLeft();
        Assert.assertEquals("1",expected.toString());
    }

    @Test
    public void secondPatternLeftOperandShouldBe9(){
        Captcha captcha = new Captcha(2,9,operatorDummy,rightDummy);
        Operand expected = captcha.getLeft();
        Assert.assertEquals("9",expected.toString());
    }

    @Test
    public void secondPatternLeftOperandShouldBe5(){
        Captcha captcha = new Captcha(2,5,operatorDummy,rightDummy);
        Operand expected = captcha.getLeft();
        Assert.assertEquals("5",expected.toString());
    }

    @Test
    public void secondPatternRightOperandShouldBeOne(){
        Captcha captcha = new Captcha(2,leftDummy,operatorDummy,1);
        Operand expected = captcha.getRight();
        Assert.assertEquals("One",expected.toString());
    }

    @Test
    public void secondPatternRightOperandShouldBeNine(){
        Captcha captcha = new Captcha(2,leftDummy,operatorDummy,9);
        Operand expected = captcha.getRight();
        Assert.assertEquals("Nine",expected.toString());
    }

    @Test
    public void secondPatternRightOperandShouldBeFive(){
        Captcha captcha = new Captcha(2,leftDummy,operatorDummy,5);
        Operand expected = captcha.getRight();
        Assert.assertEquals("Five",expected.toString());
    }

    @Test
    public void firstPatternToStringShouldBeOnePlus1(){
        Captcha captcha = new Captcha(1,1,1,1);
        Assert.assertEquals("One + 1",captcha.toString());
    }

    @Test
    public void firstPatternToStringShouldBeOneMultiply1(){
        Captcha captcha = new Captcha(1,1,2,1);
        Assert.assertEquals("One * 1",captcha.toString());
    }

    @Test
    public void firstpatternToStringShouldBeOneMinus1(){
        Captcha captcha = new Captcha(1,1,3,1);
        Assert.assertEquals("One - 1",captcha.toString());
    }

    @Test
    public void firstPatternToStringShouldBeOneDevide1(){
        Captcha captcha = new Captcha(1,1,4,1);
        Assert.assertEquals("One / 1",captcha.toString());
    }

    @Test
    public void secondPatternToStringShouldBe1PlusOne(){
        Captcha captcha = new Captcha(2,1,1,1);
        Assert.assertEquals("1 + One",captcha.toString());
    }

    @Test
    public void secondPatternToStringShouldBe1MultiplyOne(){
        Captcha captcha = new Captcha(2,1,2,1);
        Assert.assertEquals("1 * One",captcha.toString());
    }

    @Test
    public void secondPatternToStringShouldBe1MinusOne(){
        Captcha captcha = new Captcha(2,1,3,1);
        Assert.assertEquals("1 - One",captcha.toString());
    }

    @Test
    public void secondPatternToStringShouldBe1DevideOne(){
        Captcha captcha = new Captcha(2,1,4,1);
        Assert.assertEquals("1 / One",captcha.toString());
    }

    @Test
    public void itShouldReturnInstanceOfOperator(){
        Captcha captcha = new Captcha(1,leftDummy,operatorDummy,rightDummy);
        Assert.assertTrue(captcha.getOperator() instanceof Operator);
    }

    @Test
    public void firstPatternLeftShouldBeInstanceOfOperand(){
        Captcha captcha = new Captcha(1,1,operatorDummy,rightDummy);
        Assert.assertTrue(captcha.getLeft() instanceof Operand);
    }

    @Test
    public void firstPatternRightShouldBeInstanceOfOperand(){
        Captcha captcha = new Captcha(1,leftDummy,operatorDummy,1);
        Assert.assertTrue(captcha.getRight() instanceof Operand);
    }
}
