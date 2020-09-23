package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Then2() {
        int expected = 2;
        int p = 6;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP40K5Then45() {
        int expected = 45;
        int p = 40;
        int k = 5;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP60K20Then20() {
        int expected = 20;
        int p = 60;
        int k = 20;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}