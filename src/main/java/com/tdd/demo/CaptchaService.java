package com.tdd.demo;

public class CaptchaService {
    private Captcha captcha;
    private Randomizer randomizer;
    public CaptchaService(Captcha captcha,Randomizer randomizer) {
        this.captcha = captcha;
        this.setRandomizer(randomizer);
    }

    public CaptchaService(Randomizer randomizer){
        this.randomizer = randomizer;
        this.captcha = new Captcha(this.getRandomizer().getPattern(),
                this.getRandomizer().getOperand(),
                this.getRandomizer().getOperator(),
                this.getRandomizer().getOperand());
    }

    public Randomizer getRandomizer() {
        return randomizer;
    }

    public void setRandomizer(Randomizer randomizer) {
        this.randomizer = randomizer;
    }

    public String getCaptcha() {
        return this.captcha.toString();
    }

}
