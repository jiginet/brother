package com.jigi.brother.stackNqueue;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CrossingTruckTest {

    @Test
    void crossingTruckTest() {

        CrossingTruck quiz = new CrossingTruck();

        int[] p1 = {7, 4, 5, 6};
        assertThat(quiz.solution(2, 10, p1), is(8));

        int[] p2 = {10};
        assertThat(quiz.solution(100, 100, p2), is(101));

        int[] p3 = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        assertThat(quiz.solution(100, 100, p3), is(110));

    }
}
