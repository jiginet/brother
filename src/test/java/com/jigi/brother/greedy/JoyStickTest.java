package com.jigi.brother.greedy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class JoyStickTest {
    @Test
    void joyStickTest() {

        JoyStick quiz = new JoyStick();

        assertThat(quiz.solution("BBBBAAAAB"), is(10));
        assertThat(quiz.solution("BBBBB"), is(9));
        assertThat(quiz.solution("JAZ"), is(11));
        assertThat(quiz.solution("JEROEN"), is(56));
        assertThat(quiz.solution("JAN"), is(23));
    }
}