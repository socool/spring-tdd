package com.tdd.demo;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class CaptchaServiceTest {
    @Test
    public void getCaptchaShouldBeInvokeOnce(){
        CaptchaSpy captcha = new CaptchaSpy(1,1,1,1);
        RandomizerSpy randomizer = new RandomizerSpy();
        CaptchaService captchaService = new CaptchaService(captcha,randomizer);
        Assert.assertEquals(1,captcha.getInvokeCount());
        Assert.assertEquals(1,randomizer.getInvokeCount());
    }
    @Test
    public void getCaptchaShouldBeValid(){
        RandomizerSpy randomizer = new RandomizerSpy();
        CaptchaService captchaService = new CaptchaService(randomizer);
        System.out.println(captchaService.getCaptcha());
        Assert.assertNotNull(captchaService.getCaptcha());
    }

    @Test
    public void getCaptchaShouldBeOneplus1(){
        CaptchaSpy captcha = new CaptchaSpy(1,1,1,1);
        RandomizerSpy randomizer = new RandomizerSpy();
        CaptchaService captchaService = new CaptchaService(captcha,randomizer);
        Assert.assertEquals("One + 1",captchaService.getCaptcha());
        Assert.assertEquals(1,captcha.getToStringCount());
    }

    @Test
    public void getPatternRandomizerShouldBeCallOnce(){
        CaptchaService captchaService = new CaptchaService(new RandomizerStub());
        String actual = captchaService.getCaptcha();
        Assert.assertEquals("Nine + 9",actual);
    }

    public class CaptchaSpy extends Captcha{
        private int invokeCount=0;
        private int toStringCount=0;

        public int getInvokeCount() {
            return invokeCount;
        }

        public int getToStringCount() {
            return toStringCount;
        }

        public CaptchaSpy(int pattern, int leftOperand, int operator, int rightOperand) {
            super(pattern, leftOperand, operator, rightOperand);
            this.invokeCount++;
        }
        public String toString(){
            this.toStringCount++;
            return super.toString();
        }
    }

    public class RandomizerSpy extends com.tdd.demo.Randomizer {
        private int invokeCount=0;

        public int getInvokeCount() {
            return invokeCount;
        }

        public RandomizerSpy() {
            this.invokeCount++;
        }
    }

    public class RandomizerStub extends Randomizer{
        public RandomizerStub() {

        }

        @Override
        public int getPattern() {
            return 1;
        }

        @Override
        public int getOperand() throws IndexOutOfBoundsException {
            return 9;
        }

        @Override
        public int getOperator() {
            return 1;
        }
    }
}
