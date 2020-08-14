package com.jigi.brother.array;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class MockExamTest {
    @Test
    void mockExamTest() {
        MockExam quiz = new MockExam();

        assertThat(quiz.solution(new int[]{1, 2, 3, 4, 5}), is(new int[]{1}));
        assertThat(quiz.solution(new int[]{1, 3, 2, 4, 2}), is(new int[]{1, 2, 3}));
    }
}