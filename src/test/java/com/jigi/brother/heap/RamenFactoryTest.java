package com.jigi.brother.heap;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * 문제URL : https://programmers.co.kr/learn/courses/30/lessons/42629
 */
class RamenFactoryTest {

    @Test
    @DisplayName("라면공장")
    void ramenFactoryTest() {
        RamenFactory quiz = new RamenFactory();

        int p1 = 4;
        int[] p2 = {4, 10, 15};
        int[] p3 = {20, 5, 10};
        int p4 = 30;
        assertThat(quiz.solution(p1, p2, p3, p4), is(2));

        int p10 = 10;
        int[] p20 = {4, 10, 15};
        int[] p30 = {30, 5, 10};
        int p40 = 30;
        assertThat(quiz.solution(p10, p20, p30, p40), is(1));

        int p100 = 10;
        int[] p200 = {10, 10, 15};
        int[] p300 = {20, 5, 10};
        int p400 = 30;
        assertThat(quiz.solution(p100, p200, p300, p400), is(1));

        int p1000 = 10;
        int[] p2000 = {2, 4, 6, 9, 10, 29};
        int[] p3000 = {2, 2, 2, 10, 20, 30};
        int p4000 = 30;
        assertThat(quiz.solution(p1000, p2000, p3000, p4000), is(1));

    }

}