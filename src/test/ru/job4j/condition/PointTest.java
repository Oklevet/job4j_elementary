package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
   public void when04to00then4() {
        double expected = 4;
        Point a = new Point(0, 4);
        Point b = new Point(0, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when0m33to313then5() {
        double expected = 5;
        Point a = new Point(0, -3, 3);
        Point b = new Point(3, 1, 3);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}