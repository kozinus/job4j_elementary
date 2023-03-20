package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2To3To4Then4() {
        int result = Max.max(1, 2, 3, 4);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5To3Then5() {
        int left = 5;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax7To10To9Then10() {
        int result = Max.max(7, 10, 9);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }
}