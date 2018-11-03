package com.tdd.demo;

public class Captcha {
    private int pattern;
    private int leftOperand;
    private int operator;
    private int rightOperand;

    private String[] numberString = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    private String[] operatorString = {"+","*","-","/"};

    public int getPattern() {
        return pattern;
    }

    public void setPattern(int pattern) {
        this.pattern = pattern;
    }

    public int getLeftOperand() {
        return leftOperand;
    }

    public void setLeftOperand(int leftOperand) {
        this.leftOperand = leftOperand;
    }

    public int getOperator() {
        return operator;
    }

    public void setOperator(int operator) {
        this.operator = operator;
    }

    public int getRightOperand() {
        return rightOperand;
    }

    public void setRightOperand(int rightOperand) {
        this.rightOperand = rightOperand;
    }

    public Captcha(int pattern, int leftOperand, int operator, int rightOperand) {
        this.setPattern(pattern);
        this.setLeftOperand(leftOperand);
        this.setOperator(operator);
        this.setRightOperand(rightOperand);
    }

    public String getLeft() {
        return this.numberString[this.getLeftOperand()-1];
    }

    public String getRight() {
        return String.valueOf(this.rightOperand);
    }

    public String getStringOperator() {
        return this.operatorString[this.operator-1];
    }
}
