package com.jigi.brother.array;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class SumArraysTest {

    @Test
    void sumArraysTest() {

        SumArrays quiz = new SumArrays();

        int[][] p1 = new int[][]{{1, 2}, {2, 3}};
        int[][] p2 = new int[][]{{3, 4}, {5, 6}};
        int[][] r1 = new int[][]{{4, 6}, {7, 9}};
        assertThat(quiz.solution(p1, p2), is(r1));

        int[][] p3 = new int[][]{{1}, {2}};
        int[][] p4 = new int[][]{{3}, {4}};
        int[][] r2 = new int[][]{{4}, {6}};
        assertThat(quiz.solution(p3, p4), is(r2));

        int[][] p5 = new int[][]{{1, 2}};
        int[][] p6 = new int[][]{{3, 4}};
        int[][] r3 = new int[][]{{4, 6}};
        assertThat(quiz.solution(p5, p6), is(r3));

    }
}