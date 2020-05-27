package com.jigi.brother.string;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


class CenterLettersTest {
    @Test
    void centerLettersTest() {
        CenterLetters quiz = new CenterLetters();

        assertThat(quiz.solution("abcde"), is("c"));

        assertThat(quiz.solution("qwer"), is("we"));

        assertThat(quiz.solution("a"), is("a"));

        assertThat(quiz.solution("123456"), is("34"));

    }
}