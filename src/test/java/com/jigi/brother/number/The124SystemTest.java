package com.jigi.brother.number;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class The124SystemTest {

    @Test
    void the124SystemTest() {
        The124System quiz = new The124System();

        assertThat(quiz.solution(1), is("1"));
        assertThat(quiz.solution(2), is("2"));
        assertThat(quiz.solution(3), is("4"));
        assertThat(quiz.solution(4), is("11"));
        assertThat(quiz.solution(5), is("12"));
        assertThat(quiz.solution(10), is("41"));
        assertThat(quiz.solution(12), is("44"));
        assertThat(quiz.solution(13), is("111"));


        assertThat(quiz.solution2(1), is("1"));
        assertThat(quiz.solution2(2), is("2"));
        assertThat(quiz.solution2(3), is("4"));
        assertThat(quiz.solution2(4), is("11"));
        assertThat(quiz.solution2(5), is("12"));
        assertThat(quiz.solution2(10), is("41"));
        assertThat(quiz.solution2(12), is("44"));
        assertThat(quiz.solution2(13), is("111"));

    }
}