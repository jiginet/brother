package com.jigi.brother.array;


import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class NumberToReverseArrayTest {

    @Test
    void numberToReverseArrayTest() {
        NumberToReverseArray quiz = new NumberToReverseArray();

        assertThat(quiz.solution(12345L), is(new int[]{5, 4, 3, 2, 1}));

        assertThat(quiz.solution(12340L), is(new int[]{0, 4, 3, 2, 1}));

        assertThat(quiz.solution(0L), is(new int[]{0}));

        assertThat(quiz.solution(10000000000L), is(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}));
    }

}