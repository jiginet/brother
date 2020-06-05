package com.jigi.brother.number;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class StepNumbersTest {

    @Test
    void stepNumbersTest() {

        StepNumbers quiz = new StepNumbers();

        assertThat(quiz.solution(2, 5), is(new long[]{2, 4, 6, 8, 10}));
        assertThat(quiz.solution(3, 3), is(new long[]{3, 6, 9}));
        assertThat(quiz.solution(4, 3), is(new long[]{4, 8, 12}));
        assertThat(quiz.solution(-4, 2), is(new long[]{-4, -8}));
        assertThat(quiz.solution(0, 5), is(new long[]{0, 0, 0, 0, 0}));
        assertThat(quiz.solution(1, 2), is(new long[]{1, 2}));
        assertThat(quiz.solution(-1, 3), is(new long[]{-1, -2, -3}));
        assertThat(quiz.solution(-10000000, 3), is(new long[]{-10000000, -20000000, -30000000}));


    }

}