package com.jigi.brother.greedy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class SportsWearTest {

    @Test
    void sportsWearTest() {

        SportsWear quiz = new SportsWear();

        assertThat(quiz.solution(5, new int[]{2, 4}, new int[]{1, 3, 5}), is(5));

        assertThat(quiz.solution(5, new int[]{2, 4}, new int[]{3}), is(4));

        assertThat(quiz.solution(5, new int[]{1}, new int[]{3, 4, 5}), is(4));

        assertThat(quiz.solution(3, new int[]{3}, new int[]{1}), is(2));

        assertThat(quiz.solution(5, new int[]{2, 3}, new int[]{1, 3}), is(5));

        assertThat(quiz.solution(2, new int[]{1}, new int[]{1}), is(2));

        assertThat(quiz.solution(5, new int[]{1, 2}, new int[]{2, 3}), is(4));

    }

}