package com.jigi.brother.recursive;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class BracketTest {

    @Test
    void bracketTest() {

        Bracket quiz = new Bracket();

        assertThat(quiz.solution("(()())()"), is("(()())()"));
        assertThat(quiz.solution(")("), is("()"));
        assertThat(quiz.solution("()))((()"), is("()(())()"));

    }
}