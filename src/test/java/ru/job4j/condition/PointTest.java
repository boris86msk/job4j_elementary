package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when20to13then3dot16() {
        double expected = 3.16;
        Point a = new Point(2, 0);
        Point b = new Point(1, 3);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when63to15then5dot38() {
        double expected = 5.38;
        Point a = new Point(6, 3);
        Point b = new Point(1, 5);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}