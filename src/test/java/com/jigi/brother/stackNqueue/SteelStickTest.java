package com.jigi.brother.stackNqueue;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class SteelStickTest {

    @Test
    void steelStickTest() {

        SteelStick quiz = new SteelStick();

        assertThat(quiz.solution("()(((()())(())()))(())"), is(17));
        assertThat(quiz.solution("()(())()(())()"), is(4));
        assertThat(quiz.solution("()((())()(()))()"), is(8));

        assertThat(SteelStick.solution2("()(((()())(())()))(())"), is(17));
        assertThat(SteelStick.solution2("()(())()(())()"), is(4));
        assertThat(SteelStick.solution2("()((())()(()))()"), is(8));

        assertThat(SteelStick.solution3("()(((()())(())()))(())"), is(17));
        assertThat(SteelStick.solution3("()(())()(())()"), is(4));
        assertThat(SteelStick.solution3("()((())()(()))()"), is(8));

    }
}