package com.tdd.demo;

public class StringOperand implements Operand{
    private int operand;
    private String[] numberString = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    public StringOperand(int operand) {
        this.operand = operand;
    }

    public String toString() {
        return this.numberString[this.operand-1];
    }
}
