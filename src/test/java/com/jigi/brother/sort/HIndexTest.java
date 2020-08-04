package com.jigi.brother.sort;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class HIndexTest {
    @Test
    void hIndexTest() {

        HIndex quiz = new HIndex();

        int[] p1 = {3, 0, 6, 1, 5};
        assertThat(quiz.solution(p1), is(3));
        assertThat(quiz.solution2(p1), is(3));

        int[] p2 = {1, 1, 1, 7, 20};
        assertThat(quiz.solution(p2), is(2));
        assertThat(quiz.solution2(p2), is(2));

        int[] p3 = {1};
        assertThat(quiz.solution(p3), is(1));
        assertThat(quiz.solution2(p3), is(1));

        int[] p4 = {0};
        assertThat(quiz.solution(p4), is(0));
        assertThat(quiz.solution2(p4), is(0));

        int[] p5 = {10};
        assertThat(quiz.solution(p5), is(1));
        assertThat(quiz.solution2(p5), is(1));

        int[] p6 = {2, 10, 3};
        assertThat(quiz.solution(p6), is(2));
        assertThat(quiz.solution2(p6), is(2));

    }
}