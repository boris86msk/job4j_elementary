package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class SortSelectedTest {

    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf8elements() {
        int[] data = new int[] {8, 4, 3, 2, 5, 1, 10, 6};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5, 6, 8, 10};
        Assert.assertArrayEquals(expected, result);
    }
}