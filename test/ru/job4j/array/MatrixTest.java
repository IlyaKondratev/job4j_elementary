package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void when2on2() {
        int size = 2;
        int[][] expected = {{1, 2},
                            {2, 4}};
        int[][] result = Matrix.multiple(size);
        assertThat(result, is(expected));
    }

    @Test
    public void when3on3() {
        int size = 3;
        int[][] expected = {{1, 2, 3},
                            {2, 4, 6},
                            {3, 6, 9}};
        int[][] result = Matrix.multiple(size);
        assertThat(result, is(expected));
    }
}