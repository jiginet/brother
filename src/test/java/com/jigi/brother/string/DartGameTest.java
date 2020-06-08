package com.jigi.brother.string;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class DartGameTest {

    @Test
    void dartGameTest() {
        DartGame quiz = new DartGame();

        assertThat(quiz.solution("1S2D*3T"), is(37)); // 1^1 * 2 + 2^2 * 2 + 3^3
        assertThat(quiz.solution("1D2S#10S"), is(9)); // 1^2 + 2^1 * (-1) + 10^1
        assertThat(quiz.solution("1D2S0T"), is(3)); // 1^2 + 2^1 + 0^3
        assertThat(quiz.solution("1S*2T*3S"), is(23)); // 1^1 * 2 * 2 + 2^3 * 2 + 3^1
        assertThat(quiz.solution("1D#2S*3S"), is(5)); // 1^2 * (-1) * 2 + 2^1 * 2 + 3^1
        assertThat(quiz.solution("1T2D3D#"), is(-4)); // 1^3 + 2^2 + 3^2 * (-1)
        assertThat(quiz.solution("1D2S3T*"), is(59)); // 1^2 + 2^1 * 2 + 3^3 * 2
        assertThat(quiz.solution("0D1S1T*"), is(4));

    }

}