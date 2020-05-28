package com.jigi.brother.array;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class ArrayAvgTest {

    @Test
    void arrayAvgTest() {
        ArrayAvg quiz = new ArrayAvg();

        assertThat(quiz.solution(new int[]{1, 2, 3, 4}), is(2.5));
        assertThat(quiz.solution(new int[]{5, 5}), is(5.0));
        assertThat(quiz.solution(new int[]{-1, -3}), is(-2.0));
        assertThat(quiz.solution(new int[]{-1, 1}), is(0.0));
        assertThat(quiz.solution(new int[]{-1, 0, 1}), is(0.0));

    }
}