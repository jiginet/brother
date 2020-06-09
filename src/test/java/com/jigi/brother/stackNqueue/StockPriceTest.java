package com.jigi.brother.stackNqueue;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class StockPriceTest {
    @Test
    void stockPriceTest() {

        StockPrice quiz = new StockPrice();

        int[] p1 = {1, 2, 3, 2, 3};
        int[] r1 = {4, 3, 1, 1, 0};
        assertThat(quiz.solution(p1), is(r1));
        assertThat(quiz.solution2(p1), is(r1));

        int[] p10 = {1, 2, 3, 2, 3, 1};
        int[] r10 = {5, 4, 1, 2, 1, 0};
        assertThat(quiz.solution(p10), is(r10));
        assertThat(quiz.solution2(p10), is(r10));

        int[] p100 = {3, 1};
        int[] r100 = {1, 0};
        assertThat(quiz.solution(p100), is(r100));
        assertThat(quiz.solution2(p100), is(r100));

        int[] p1000 = {1, 2, 3, 1, 3, 1};
        int[] r1000 = {5, 2, 1, 2, 1, 0};
        assertThat(quiz.solution(p1000), is(r1000));
        assertThat(quiz.solution2(p1000), is(r1000));

        int[] p10000 = {2, 1, 3, 2, 1, 1};
        int[] r10000 = {1, 4, 1, 1, 1, 0};
        assertThat(quiz.solution(p10000), is(r10000));
        assertThat(quiz.solution2(p10000), is(r10000));

    }
}