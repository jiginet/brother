package com.jigi.brother.combination;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class MakePrimeTest {

    @Test
    @DisplayName("소수 만들기")
    void makePrimeTest() {

        MakePrime quiz = new MakePrime();
        assertThat(quiz.solution(new int[]{1, 2, 3, 4}), is(1));

        quiz = new MakePrime();
        assertThat(quiz.solution(new int[]{1, 2, 7, 6, 4}), is(4));

    }
}