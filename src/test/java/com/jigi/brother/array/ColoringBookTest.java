package com.jigi.brother.array;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class ColoringBookTest {

    @Test
    void coloringBookTest() {

        ColoringBook quiz = new ColoringBook();

        int p1 = 6;
        int p2 = 4;
        int[][] p3 = {
                {1, 1, 1, 0},
                {1, 2, 2, 0},
                {1, 0, 0, 1},
                {0, 0, 0, 1},
                {0, 0, 0, 3},
                {0, 0, 0, 3}};
        int[] r1 = {4, 5};

        assertThat(quiz.solution(p1, p2, p3), is(r1));
        assertThat(quiz.solution2(p1, p2, p3), is(r1));


        int p10 = 6;
        int p20 = 4;
        int[][] p30 = {
                {1, 1, 1, 0},
                {1, 1, 1, 0},
                {0, 0, 0, 1},
                {0, 0, 0, 1},
                {0, 0, 0, 1},
                {0, 0, 0, 1}};
        int[] r10 = {2, 6};

        assertThat(quiz.solution(p10, p20, p30), is(r10));
        assertThat(quiz.solution2(p10, p20, p30), is(r10));

        int p100 = 6;
        int p200 = 5;
        int[][] p300 = {
                {0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0},
                {0, 1, 0, 1, 0},
                {0, 1, 1, 1, 0},
                {0, 0, 2, 2, 3},
                {1, 0, 2, 3, 3}};
        int[] r100 = {4, 8};

        assertThat(quiz.solution(p100, p200, p300), is(r100));
        assertThat(quiz.solution2(p100, p200, p300), is(r100));


    }
}