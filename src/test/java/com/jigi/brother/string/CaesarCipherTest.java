package com.jigi.brother.string;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class CaesarCipherTest {

    @Test
    void caesarCipherTest() {
        CaesarCipher quiz = new CaesarCipher();

        assertThat(quiz.solution("AB", 1), is("BC"));
        assertThat(quiz.solution("z", 1), is("a"));
        assertThat(quiz.solution("a B z", 4), is("e F d"));

        assertThat(quiz.solution(" Za ", 1), is(" Ab "));
        assertThat(quiz.solution(" za ", 1), is(" ab "));

        assertThat(quiz.solution("a", 25), is("z"));
    }
}