package com.tdd.demo;

public class OperandFactory {
    public static Operand getLeft(int pattern,int operand){
        if(pattern == 1){
            return new StringOperand(operand);
        }else{
            return new IntegerOperand(operand);
        }
    }

    public static Operand getRight(int pattern, int operand) {
        if(pattern == 1){
            return new IntegerOperand(operand);
        }else{
            return new StringOperand(operand);
        }
    }
}
