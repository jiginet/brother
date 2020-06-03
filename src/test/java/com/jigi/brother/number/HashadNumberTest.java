package com.jigi.brother.number;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


class HashadNumberTest {

    @Test
    void hashadNumberTest() {
        HashadNumber quiz = new HashadNumber();

        assertThat(quiz.solution(10), is(true));
        assertThat(quiz.solution(12), is(true));
        assertThat(quiz.solution(11), is(false));
        assertThat(quiz.solution(13), is(false));
        assertThat(quiz.solution(1), is(true));
        assertThat(quiz.solution(2), is(true));
        assertThat(quiz.solution(1234), is(false));
        assertThat(quiz.solution(1000), is(true));
        assertThat(quiz.solution(1200), is(true));


    }

}