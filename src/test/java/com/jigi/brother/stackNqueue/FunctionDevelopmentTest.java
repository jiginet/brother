package com.jigi.brother.stackNqueue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class FunctionDevelopmentTest {

    @Test
    @DisplayName("기능개발")
    void functionDevelopmentTest() {

        FunctionDevelopment quiz = new FunctionDevelopment();

        int[] p1 = {93, 30, 55};
        int[] p2 = {1, 30, 5};
        int[] r1 = {2, 1};
        assertThat(quiz.solution(p1, p2), is(r1));

        assertThat(quiz.solution2(p1, p2), is(r1));

    }
}