package com.jigi.brother.stackNqueue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CrossingTruckTest {

    @Test
    @DisplayName("다리를 지나는 트럭")
    void crossingTruckTest() {

        CrossingTruck quiz = new CrossingTruck();

        int[] p1 = {7, 4, 5, 6};
        assertThat(quiz.solution(2, 10, p1), is(8));

        int[] p2 = {10};
        assertThat(quiz.solution(100, 100, p2), is(101));

        int[] p3 = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        assertThat(quiz.solution(100, 100, p3), is(110));

        assertThat(quiz.solution2(2, 10, p1), is(8));
        assertThat(quiz.solution2(100, 100, p2), is(101));
        assertThat(quiz.solution2(100, 100, p3), is(110));

    }
}
