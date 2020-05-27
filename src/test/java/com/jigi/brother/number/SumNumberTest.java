package com.jigi.brother.number;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class SumNumberTest {

    @Test
    void sumNumberTest() {

        SumNumber quiz = new SumNumber();

        assertThat(quiz.solution(3, 5), is(12L));

        assertThat(quiz.solution(3, 3), is(3L));

        assertThat(quiz.solution(5, 3), is(12L));

        assertThat(quiz.solution(-1, 1), is(0L));

        assertThat(quiz.solution(-1, -3), is(-6L));

        assertThat(quiz.solution(-3, -1), is(-6L));

        assertThat(quiz.solution(-1, -1), is(-1L));

        assertThat(quiz.solution(0, 2), is(3L));

        assertThat(quiz.solution(2, 0), is(3L));

        assertThat(quiz.solution(0, 0), is(0L));

        assertThat(quiz.solution(-5, -5), is(-5L));

        assertThat(quiz.solution(-10, 10), is(0L));

        assertThat(quiz.solution(-1, 10), is(54L));

        assertThat(quiz.solution(-10000000, -10000000), is(-10000000L));

        assertThat(quiz.solution(-10000000, -10000000), is(-10000000L));

        assertThat(quiz.solution(100000000, 100000000), is(100000000L));


    }
}