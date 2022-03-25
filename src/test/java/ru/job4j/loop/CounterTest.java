package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromThreeToThirteenThenForty() {
        int start = 3;
        int finish = 13;
        int result = Counter.sumByEven(start, finish);
        int expected = 40;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromZeroToNinetyNineThenTwoThousandFourHundredAndFifty() {
        int start = 0;
        int finish = 99;
        int result = Counter.sumByEven(start, finish);
        int expected = 2450;
        Assert.assertEquals(expected, result);
    }
}