package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FactTest {

    @Test (expected = IllegalArgumentException.class)
    public void calcMinusThenExcep() {
        int rsl = Fact.calc(-8);
    }

    @Test
    public void calc0Then1() {
        int rsl = Fact.calc(0);
        int expected = 1;
        assertThat(rsl, is(expected));
    }

    @Test
    public void calc5Then120() {
        int rsl = Fact.calc(5);
        int expected = 120;
        assertThat(rsl, is(expected));
    }
}