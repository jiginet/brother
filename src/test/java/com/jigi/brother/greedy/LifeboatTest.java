package com.jigi.brother.greedy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class LifeboatTest {
    @Test
    void lifeboatTest() {

        Lifeboat quiz = new Lifeboat();

        int[] p100 = {40, 45, 50, 55, 60, 70, 70, 80, 90, 100, 120};
        int p200 = 120;
        assertThat(quiz.solution(p100, p200), is(7 ));
        assertThat(quiz.solution2(p100, p200), is(7 ));

        int[] p1 = {70, 50, 80, 50};
        int p2 = 100;
        assertThat(quiz.solution(p1, p2), is(3));
        assertThat(quiz.solution2(p1, p2), is(3));

        int[] p10 = {70, 80, 50};
        int p20 = 100;
        assertThat(quiz.solution(p10, p20), is(3));
        assertThat(quiz.solution2(p10, p20), is(3));

    }
}