package com.jigi.brother.number;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class CheckSquareRootTest {

    @Test
    void checkSquareRootTest() {

        CheckSquareRoot quiz = new CheckSquareRoot();

        assertThat(quiz.solution(121l), is(144l));
        assertThat(quiz.solution(3l), is(-1l));
    }
}