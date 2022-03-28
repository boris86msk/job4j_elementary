package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNot13ThenMinus1() {
        int[] data = {4, 8, 3, 7};
        int el = 13;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = new int[]{5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

        @Test
        public void whenDiapasonHasNot8ThenMinus1() {
            int[] data = new int[] {5, 2, 10, 2, 4, 7, 0};
            int el = 8;
            int start = 3;
            int finish = 6;
            int result = FindLoop.indexInRange(data, el, start, finish);
            int expected = -1;
            Assert.assertEquals(expected, result);
        }
}