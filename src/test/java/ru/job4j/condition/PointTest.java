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

    @Test
    public void when000to202then2dot82() {
        double expected = 2.82;
        Point one = new Point(0, 0, 0);
        Point two = new Point(2, 0, 2);
        Assert.assertEquals(expected, one.distance3d(two), 0.01);
    }

    @Test
    public void when007to253then6dot71() {
        double expected = 6.71;
        Point one = new Point(0, 0, 7);
        Point two = new Point(2, 5, 3);
        Assert.assertEquals(expected, one.distance3d(two), 0.01);
    }

    @Test
    public void when741to209then10dot25() {
        double expected = 10.25;
        Point one = new Point(7, 4, 1);
        Point two = new Point(2, 0, 9);
        Assert.assertEquals(expected, one.distance3d(two), 0.01);
    }
}