package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap0to1() {
        int[] input = {0, 1};
        int[] expect = {1, 0};
        int[] rsl = SwitchArray.swap(input, 0, 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap0to9And1to8() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expect = {10, 9, 3, 4, 5, 6, 7, 8, 2, 1};
        int[] rsl1 = SwitchArray.swap(input, 0, input.length - 1);
        int[] rsl2 = SwitchArray.swap(rsl1, 1, input.length - 2);
        assertThat(rsl2, is(expect));
    }
}