package com.jigi.brother.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class BinaryGapTest {

    @Test
    @DisplayName("BinaryGap")
    void test1() {
        BinaryGap quiz = new BinaryGap();

        assertThat(quiz.solution(1041), is(5));

        assertThat(quiz.solution(32), is(0));
    }
}