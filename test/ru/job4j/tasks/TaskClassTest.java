package ru.job4j.tasks;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TaskClassTest {

    @Test
    public void codeLengthGreat4() {
        String code = TasksClass.code("4556364607935616");
        assertThat(code, is("############5616"));
    }

    @Test
    public void codeLengthLess4() {
        String code = TasksClass.code("123");
        assertThat(code, is("123"));
    }

    @Test
    public void codeEmptyString() {
        String code = TasksClass.code("");
        assertThat(code, is("empty"));
    }

    @Test
    public void collect() {
        String s = "North Atlantic Treaty Organization";
        String rsl = TasksClass.collect(s);
        assertThat(rsl, is("NATO"));
    }

    @Test
    public void collect1() {
        String s = "Chief Executive Officer";
        String rsl = TasksClass.collect(s);
        assertThat(rsl, is("CEO"));
    }

    @Test
    public void collect2() {
        String s = "United Nations Organization";
        String rsl = TasksClass.collect(s);
        assertThat(rsl, is("UNO"));
    }
}