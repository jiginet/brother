package com.jigi.brother.number;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class SumDivisorTest {

    @Test
    void caesarCipherTest() {
        SumDivisor quiz = new SumDivisor();

        assertThat(quiz.solution(0), is(0));
        assertThat(quiz.solution(12), is(28));
        assertThat(quiz.solution(5), is(6));
        assertThat(quiz.solution(1), is(1));
        assertThat(quiz.solution(30000), is(96844));

    }
}