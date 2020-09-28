package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TurnTest {

    @Test
    public void whenEven() {
        int[] input = new int[]{1, 2, 3, 4};
        int[] expected = new int[]{4, 3, 2, 1};
        int[] result = Turn.back(input);
        assertThat(result, is(expected));
    }

    @Test
    public void whenOdd() {
        int[] input = new int[]{1, 2, 3, 4, 5};
        int[] expected = new int[]{5, 4, 3, 2, 1};
        int[] result = Turn.back(input);
        assertThat(result, is(expected));
    }
}