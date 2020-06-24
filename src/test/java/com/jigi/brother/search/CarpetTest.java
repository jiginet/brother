package com.jigi.brother.search;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class CarpetTest {
    /**
     * 문제 : https://programmers.co.kr/learn/courses/30/lessons/42842
     */
    @Test
    void carpetTest() {
        Carpet quiz = new Carpet();

        assertThat(quiz.solution(10, 2), is(new int[]{4, 3}));
        assertThat(quiz.solution(8, 1), is(new int[]{3, 3}));
        assertThat(quiz.solution(24, 24), is(new int[]{8, 6}));

    }
}