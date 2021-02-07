package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax3To1Then3() {
        int result = Max.max(3, 1);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax1To1Then1() {
        int result = Max.max(1, 1);
        assertThat(result, is(1));
    }

    @Test
    public void whenMax9To1Then1() {
        int result = Max.max(9, 7,  1);
        assertThat(result, is(9));
    }

    @Test
    public void whenMax1To5Then5() {
        int result = Max.max(5, 5,  1);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax5To1Then5() {
        int result = Max.max(1, 4, 5, 2);
        assertThat(result, is(5));
    }

    public void whenMax0To0Then0() {
        int result = Max.max(0, 0, 0, 0);
        assertThat(result, is(0));
    }
}