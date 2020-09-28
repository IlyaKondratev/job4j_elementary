package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] input = {5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas1Then4() {
        int[] input = {7, 11, -2, 22, 1, 333, -222};
        int value = 1;
        int result = FindLoop.indexOf(input, value);
        int expected = 4;
        assertThat(result, is(expected));
    }

    @Test
    public void whenArrayHas1Then1() {
        int[] input = {7, 1, -2, 1, 1};
        int value = 1;
        int result = FindLoop.indexOf(input, value);
        int expected = 1;
        assertThat(result, is(expected));
    }
}