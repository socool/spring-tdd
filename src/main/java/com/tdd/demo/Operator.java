package com.tdd.demo;

public class Operator {
    private int operator;
    private String[] operatorString = {"+","*","-","/"};

    public Operator(int operator){
        this.operator = operator;
    }

    @Override
    public String toString() {
        return this.operatorString[this.operator-1];
    }
}
