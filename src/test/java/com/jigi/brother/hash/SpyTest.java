package com.jigi.brother.hash;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class SpyTest {

    /**
     * 문제 : https://programmers.co.kr/learn/courses/30/lessons/42578
     */
    @Test
    void spyTest() {
        Spy quiz = new Spy();

        String[][] p1 = {
                {"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"},
        };
        assertThat(quiz.solution(p1), is(5));

        String[][] p2 = {
                {"crow_mask", "face"},
                {"blue_sunglasses", "face"},
                {"smoky_makeup", "face"},
        };
        assertThat(quiz.solution(p2), is(3));


        String[][] p3 = {
                {"name1", "item1"},
                {"name2", "item2"},
                {"name3", "item3"},
        };
        assertThat(quiz.solution(p3), is(7));
    }

}