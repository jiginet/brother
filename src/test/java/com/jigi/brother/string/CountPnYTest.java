package com.jigi.brother.string;


import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class CountPnYTest {

    @Test
    void countPnYTest() {
        CountPnY quiz = new CountPnY();

        assertThat(quiz.solution("pPoooyY"), is(true));

        assertThat(quiz.solution("Pyy"), is(false));

        assertThat(quiz.solution("aaa"), is(true));

    }
}