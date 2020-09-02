package com.jigi.brother.array;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class TargetNumberTest {

    @Test
    void targetNumberTest() {

        TargetNumber quiz = new TargetNumber();

        int[] p1 = {1, 1, 1, 1, 1};
        int p2 = 3;
        assertThat(quiz.solution(p1, p2), is(5));

        int[] p10 = {1, 2, 3, 4, 5};
        int p20 = 15;
        assertThat(quiz.solution(p10, p20), is(1));

        int[] p100 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int p200 = 210;
        assertThat(quiz.solution(p100, p200), is(1));
    }
}