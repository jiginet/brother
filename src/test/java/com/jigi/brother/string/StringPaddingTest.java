package com.jigi.brother.string;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class StringPaddingTest {

    @Test
    void stringPaddingTest() {

        StringPadding quiz = new StringPadding();

        assertThat(quiz.solution(3), is("수박수"));
        assertThat(quiz.solution(4), is("수박수박"));
        assertThat(quiz.solution(5), is("수박수박수"));
    }

}