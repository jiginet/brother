package com.jigi.brother.number;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class EvenOrOddTest {

    @Test
    void evenOrOddTest() {
        EvenOrOdd quiz = new EvenOrOdd();

        assertThat(quiz.solution(3), is("Odd"));
        assertThat(quiz.solution(-3), is("Odd"));
        assertThat(quiz.solution(4), is("Even"));
        assertThat(quiz.solution(-4), is("Even"));
        assertThat(quiz.solution(0), is("Even"));

    }

}