package com.jigi.brother.array;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class UniqueNumberTest {

    @Test
    void uniqueNumberTest() {

        UniqueNumber quiz = new UniqueNumber();

        assertThat(quiz.solution(new int[]{1, 1, 3, 3, 0, 1, 1}), is(new int[]{1, 3, 0, 1}));

        assertThat(quiz.solution(new int[]{4, 4, 4, 3, 3}), is(new int[]{4, 3}));

        assertThat(quiz.solution(new int[]{1, 1, 3, 3, 0, 1, 1}), is(new int[]{1, 3, 0, 1}));

    }
}