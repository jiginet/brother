package com.jigi.brother.array;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


class DivisorTest {

    @Test
    void divisorTest() {

        Divisor quiz = new Divisor();

        assertThat(quiz.solution(new int[]{5, 9, 7, 10}, 5), is(new int[]{5, 10}));

        assertThat(quiz.solution(new int[]{2, 36, 1, 3}, 1), is(new int[]{1, 2, 3, 36}));

        assertThat(quiz.solution(new int[]{3, 2, 6}, 10), is(new int[]{-1}));

        assertThat(quiz.solution(new int[]{-3, -2, -6}, 10), is(new int[]{-1}));

        assertThat(quiz.solution(new int[]{-3, -2, -6}, 1), is(new int[]{-6, -3, -2}));

        assertThat(quiz.solution(new int[]{1, 2, 3}, 0), is(new int[]{-1}));
    }
}