package ru.job4j.oop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance3dWhen3() {
        double expected = Math.sqrt(3);
        double out = new Point(0, 0, 0).distance3d(new Point(1, 1, 1));
        assertThat(out, is(expected));
    }

    @Test
    public void distance3dWhen15() {
        double expected = Math.sqrt(15);
        double out = new Point(0, 0, 0).distance3d(new Point(3, 4, 10));
        assertThat(out, is(expected));
    }
}