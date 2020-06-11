package com.jigi.brother.string;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class CompressStringTest {

    @Test
    void compressStringTest() {

        CompressString quiz = new CompressString();

        assertThat(quiz.solution("aabbaccc"), is(7));
        assertThat(quiz.solution("ababcdcdababcdcd"), is(9));
        assertThat(quiz.solution("abcabcdede"), is(8));
        assertThat(quiz.solution("abcabcabcabcdededededede"), is(14));
        assertThat(quiz.solution("xababcdcdababcdcd"), is(17));

    }
}