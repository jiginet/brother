package com.jigi.brother;

import com.jigi.brother.string.NextBigNumber;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class NextBigNumberTest {
    @Test
    void nextBigNumberTest() {
        NextBigNumber quiz = new NextBigNumber();

        assertThat(quiz.solution(3), is(5));
        assertThat(quiz.solution(6), is(9));
        assertThat(quiz.solution(78), is(83));
        assertThat(quiz.solution(15), is(23));

        System.out.println(Integer.bitCount(10));

    }
}