package com.tdd.demo;

public class IntegerOperand implements Operand{
    private int operand;
    public IntegerOperand(int operand){
        this.operand = operand;
    }

    public String toString() {
        return String.valueOf(this.operand);
    }
}
