package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point one = new Point(0, 0);
        Point two = new Point(2, 0);
        Assert.assertEquals(expected, one.distance(two), 0.01);
    }

    @Test
    public void when00to25then5dot385() {
        double expected = 5.385;
        Point one = new Point(0, 0);
        Point two = new Point(2, 5);
        Assert.assertEquals(expected, one.distance(two), 0.01);
    }

    @Test
    public void when74to20then6dot40() {
        double expected = 6.403;
        Point one = new Point(7, 4);
        Point two = new Point(2, 0);
        Assert.assertEquals(expected, one.distance(two), 0.01);
    }
}