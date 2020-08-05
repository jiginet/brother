package com.jigi.brother.array;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class FindBiggestSquareTest {
    /**
     * 문제 : https://programmers.co.kr/learn/courses/30/lessons/12905
     */
    @Test
    void findBiggestSquareTest() {
        FindBiggestSquare quiz = new FindBiggestSquare();

        int[][] p1 = {
                {0, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 1, 0}
        };
        assertThat(quiz.solution(p1), is(9));
        assertThat(quiz.solution2(p1), is(9));

        int[][] p1000000 = {
                {1, 1},
                {0, 1},
        };
        assertThat(quiz.solution(p1000000), is(1));
//        assertThat(quiz.solution2(p1000000), is(1));

        int[][] p10 = {
                {0, 0, 1, 1},
                {1, 1, 1, 1},
        };
        assertThat(quiz.solution(p10), is(4));
        assertThat(quiz.solution2(p10), is(4));


        int[][] p100 = {
                {0, 1, 1, 1, 0, 0},
                {0, 1, 1, 1, 1, 1},
                {0, 1, 1, 1, 1, 1},
                {0, 0, 1, 1, 1, 1},
                {0, 0, 1, 1, 1, 1},
        };
        assertThat(quiz.solution(p100), is(16));
        assertThat(quiz.solution2(p100), is(16));

        int[][] p1000 = {
                {0, 0, 0, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
        };
        assertThat(quiz.solution(p1000), is(4));
        assertThat(quiz.solution2(p1000), is(4));


        int[][] p10000 = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
        };
        assertThat(quiz.solution(p10000), is(0));
        assertThat(quiz.solution2(p10000), is(0));

        int[][] p100000 = {
                {0, 0, 0, 0},
                {0, 0, 1, 0},
        };
        assertThat(quiz.solution(p100000), is(1));
        assertThat(quiz.solution2(p100000), is(1));

        int[][] p10000000 = {
                {1, 1},
        };
        assertThat(quiz.solution(p10000000), is(1));

        int[][] p100000000 = {
                {1},
                {1}
        };
        assertThat(quiz.solution(p100000000), is(1));


        int[][] p2 = {
                {0, 0, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 1, 1, 0, 0},
                {0, 1, 1, 1, 1, 0, 0},
                {0, 0, 1, 1, 1, 0, 0},
        };
        assertThat(quiz.solution(p2), is(9));
    }
}