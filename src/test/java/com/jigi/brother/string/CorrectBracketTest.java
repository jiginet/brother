package com.jigi.brother.string;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class CorrectBracketTest {

    @Test
    void correctBracketTest() {


        CorrectBracket quiz = new CorrectBracket();

        assertThat(quiz.solution("()()"), is(true));
        assertThat(quiz.solution("(())()"), is(true));
        assertThat(quiz.solution(")()("), is(false));
        assertThat(quiz.solution("(()("), is(false));

        assertThat(quiz.solution("((((("), is(false));
        assertThat(quiz.solution(")))))"), is(false));
        assertThat(quiz.solution("()()()"), is(true));
        assertThat(quiz.solution("(()()())"), is(true));
    }

}