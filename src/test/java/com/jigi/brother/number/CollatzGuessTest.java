package com.jigi.brother.number;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class CollatzGuessTest {

    @Test
    void collatzGuessTest() {
        CollatzGuess quiz = new CollatzGuess();

        assertThat(quiz.solution(6), is(8));
        assertThat(quiz.solution(16), is(4));
        assertThat(quiz.solution(626331), is(-1));
        assertThat(quiz.solution(8000000), is(155));

    }

}