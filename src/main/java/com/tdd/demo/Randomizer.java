package com.tdd.demo;

import java.util.Random;

public class Randomizer {
    private final int MAX_OPERAND=9;
    private final int MIN_OPERAND=1;
    private Random random;

    public Randomizer(){
        this.setRandom(new Random());
    }
    public Randomizer(Random random){
        this.setRandom(random);
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public int getPattern() {
        return this.random.nextInt(2)+1;
    }

    public int getOperand() throws IndexOutOfBoundsException{
        int result = this.random.nextInt(MAX_OPERAND)+1;
        if(result > MAX_OPERAND || result < MIN_OPERAND)
            throw new IndexOutOfBoundsException("error");
        return result;
    }

    public int getOperator() {
        return this.random.nextInt(3)+1;
    }
}
