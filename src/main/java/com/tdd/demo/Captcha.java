package com.tdd.demo;

public class Captcha {
    private int pattern;
    private int leftOperand;
    private int operator;
    private int rightOperand;

    private String[] numberString = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    private String[] operatorString = {"+","*","-","/"};

    /**
     * SOLID
     * S = Single Responsibility Principle
     * O = Open/Closed Principle
     * L = Liskov Substitution Principle
     * I = Interface Segregation Principle
     * D = Dependency Inversion
     * @param pattern
     * @param leftOperand
     * @param operator
     * @param rightOperand
     */
    public Captcha(int pattern, int leftOperand, int operator, int rightOperand) {
        this.setPattern(pattern);
        this.setLeftOperand(leftOperand);
        this.setOperator(operator);
        this.setRightOperand(rightOperand);
    }

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

    public void setOperator(int operator) {
        this.operator = operator;
    }

    public int getRightOperand() {
        return rightOperand;
    }

    public void setRightOperand(int rightOperand) {
        this.rightOperand = rightOperand;
    }

    public String getLeft() {
        if(this.getPattern() == 1)
            return this.numberString[this.getLeftOperand()-1];
        else
            return String.valueOf(this.getLeftOperand());
    }

    public String getRight() {
        if(this.getPattern() == 1)
            return String.valueOf(this.rightOperand);
        else
            return this.numberString[this.rightOperand-1];
    }

    public String getOperator() {
        return this.operatorString[this.operator-1];
    }

    @Override
    public String toString() {
        return String.format("%s %s %s",this.getLeft(),this.getOperator(),this.getRight());
    }
}
