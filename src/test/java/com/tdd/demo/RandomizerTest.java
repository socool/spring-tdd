package com.tdd.demo;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * Good Unit Test
 * - Consistency return same result
 * - Runs fast
 * - Test a single logical concept in the system
 * - Readable
 * - Maintainable
 * - Trsustworthy (when you see its result, you don't need to debug the code just to be sure)
 * - care Me not You (Behavior)
 */
public class RandomizerTest {
    @Test
    public void itGetPatternShouldReturn1Or2(){
        Randomizer randomizer = new Randomizer();
        randomizer.setRandom(new Random());
        int actual = randomizer.getPattern();
        int[] expected = {1,2};
        Assert.assertTrue(IntStream.of(expected).anyMatch(x -> x == actual));
    }



    @Test
    public void itGetOperandShouldReturn1To9(){
        Randomizer randomizer = new Randomizer(new Random());
        int actual = randomizer.getOperand();
        int[] expected = {1,2,3,4,5,6,7,8,9};
        Assert.assertTrue(IntStream.of(expected).anyMatch(x -> x == actual));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void itGetOperandShouldReturn10(){
        Randomizer randomizer = new Randomizer(new Spy007Random());
        randomizer.getOperand();

    }

    @Test
    public void itGetOperatorShouldReturn1To3(){
        Randomizer randomizer = new Randomizer(new Random());
        int actual = randomizer.getOperator();
        int[] expected = {1,2,3};
        Assert.assertTrue(IntStream.of(expected).anyMatch(x -> x == actual));
    }

    @Test
    public void itShouldMockSpy(){
        Randomizer randomizer = new Randomizer();
        Spy007Random spy007Random = new Spy007Random();
        randomizer.setRandom(spy007Random);
        randomizer.getPattern();
        Assert.assertTrue(spy007Random.verifyThatNextIntHaveBeenCalledOnce());
        Assert.assertEquals(1,spy007Random.getToken());

    }
    public class Spy007Random extends Random{
        private int token = 0;
        @Override
        public int nextInt(int bound) {
            token++;
            return 10;
        }

        public int getToken() {
            return token;
        }

        public boolean verifyThatNextIntHaveBeenCalledOnce(){
            return  this.getToken() == 1;
        }
    }
}
