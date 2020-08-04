package com.jigi.brother.combination;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class NumberBaseballTest {
    @Test
    void numberBaseballTest() {

        NumberBaseball quiz = new NumberBaseball();

        int[][] p1 = {
                {123, 1, 1},
                {356, 1, 0},
                {327, 2, 0},
                {489, 0, 1},
        };
        assertThat(quiz.solution(p1), is(2));


    }
}