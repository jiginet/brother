package com.jigi.brother.array;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class FailureRateTest {

    @Test
    void failureRateTest() {
        FailureRate quiz = new FailureRate();

        int p1 = 5;
        int[] p2 = new int[]{2, 1, 2, 6, 2, 4, 3, 3};
        int[] r1 = new int[]{3, 4, 2, 1, 5};
        assertThat(quiz.solution(p1, p2), is(r1));

        int p10 = 4;
        int[] p20 = new int[]{4, 4, 4, 4, 4};
        int[] r10 = new int[]{4, 1, 2, 3};
        assertThat(quiz.solution(p10, p20), is(r10));

        int p100 = 1;
        int[] p200 = new int[]{1, 1, 1, 1};
        int[] r100 = new int[]{1};
        assertThat(quiz.solution(p100, p200), is(r100));

        int p1000 = 3;
        int[] p2000 = new int[]{1, 4, 4, 4};
        int[] r1000 = new int[]{1, 2, 3};
        assertThat(quiz.solution(p1000, p2000), is(r1000));

    }

}