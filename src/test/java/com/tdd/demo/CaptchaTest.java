package com.tdd.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CaptchaTest {
    int operatorDummy = 1;
    int rightDummy = 1;
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
}
