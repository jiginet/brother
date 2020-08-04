package com.jigi.brother;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class NextBigNumberTest {
    @Test
    void nextBigNumberTest() {
        NextBigNumber quiz = new NextBigNumber();

        assertThat(quiz.solution(0), is(0));
        assertThat(quiz.solution(78), is(83));
        assertThat(quiz.solution(15), is(23));

    }
}