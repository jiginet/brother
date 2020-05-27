package com.jigi.brother.string;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class StringToNumberTest {

    @Test
    void name() {
        StringToNumber quiz = new StringToNumber();

        assertThat(quiz.solution("123"), is(123));
        assertThat(quiz.solution("-123"), is(-123));
        assertThat(quiz.solution("+123"), is(123));
    }
}