package com.jigi.brother.number;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class SumEachNumberTest {

    @Test
    void sumEachNumberTest() {
        SumEachNumber quiz = new SumEachNumber();

        assertThat(quiz.solution(123), is(6));

        assertThat(quiz.solution(987), is(24));

        assertThat(quiz.solution(0), is(0));

        assertThat(quiz.solution(100000000), is(1));

        assertThat(quiz.solution(10), is(1));

        assertThat(quiz.solution(01), is(1));


    }
}