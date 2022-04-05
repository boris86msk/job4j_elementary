package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxMinus7To4Then7() {
        int left = 7;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To3Then3() {
        int left = 3;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMaxMinus10To4Then4() {
        int left = -10;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To4To9Then9() {
        int first = 1;
        int second = 4;
        int third = 9;
        int result = Max.max(first, second, third);
        int expected = 9;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax8To14To9To2Then14() {
        int first = 8;
        int second = 14;
        int third = 9;
        int fourth = 2;
        int result = Max.max(first, second, third, fourth);
        int expected = 14;
        Assert.assertEquals(result, expected);
    }
}