package com.tdd.demo;

public class Captcha {
    private int pattern;
    private int leftOperand;
    private int operator;
    private int rightOperand;
    public Captcha(){

    }
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

    public Operand getLeft() {
        return OperandFactory.getLeft(this.getPattern(),this.getLeftOperand());
    }

    public Operand getRight() {
        return OperandFactory.getRight(this.getPattern(),this.getRightOperand());
    }

    public Operator getOperator() {
        return new Operator(this.operator);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s",this.getLeft(),this.getOperator(),this.getRight());
    }
}
