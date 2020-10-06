package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        double out = new Point(0, 0).distance(new Point(0, 2));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to34then5() {
        double expected = 5;
        double out = new Point(0, 0).distance(new Point(3, 4));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenX5Y11toXm2Y2then11d4() {
        double expected = 11.40;
        double out = new Point(5, 11).distance(new Point(-2, 2));
        Assert.assertEquals(expected, out, 0.01);
    }
}