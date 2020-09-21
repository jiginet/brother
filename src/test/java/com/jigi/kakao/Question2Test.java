package com.jigi.kakao;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class Question2Test {

    @Test
    @DisplayName("Question2")
    void test1() {
        Question2 quiz = new Question2();

        assertThat(Question2.solution(Arrays.asList(5, 3, 6, 7, 4)), is(4));

        assertThat(Question2.solution(Arrays.asList(4, 3, 2, 1)), is(-1));

        assertThat(Question2.solution(Arrays.asList(2, 3, 10, 2, 4, 8, 1)), is(8));

        assertThat(Question2.solution(Arrays.asList(7, 9, 5, 6, 3, 2)), is(2));

        assertThat(Question2.solution(Arrays.asList(7, 9, 3, 6, 3, 2)), is(3));
    }
}