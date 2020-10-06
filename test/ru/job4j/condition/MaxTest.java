package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To2Then2() {
        int result = Max.max(2, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax3To2Then3() {
        int result = Max.max(3, 2);
        assertThat(result, is(3));
    }

    @Test
    public void whenMaxMinus3To2Then2() {
        int result = Max.max(-3, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMaxOf3WithAllDiff() {
        int result = Max.max(-3, 2, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenMaxOf3With2Equal() {
        int result = Max.max(-3, 2, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMaxOf4WithAllDiff() {
        int result = Max.max(-3, 2, 3, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenMaxOf4With2Equal() {
        int result = Max.max(-3, 5, 3, 5);
        assertThat(result, is(5));
    }

}