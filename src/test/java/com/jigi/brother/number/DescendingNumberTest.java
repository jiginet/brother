package com.jigi.brother.number;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class DescendingNumberTest {

    @Test
    void descendingNumberTest() {

        DescendingNumber quiz = new DescendingNumber();

        assertThat(quiz.solution(118372), is(873211l));
        assertThat(quiz.solution(1l), is(1l));
        assertThat(quiz.solution(8000000000l), is(8000000000l));


        assertThat(quiz.solution2(118372), is(873211l));
        assertThat(quiz.solution2(1l), is(1l));
        assertThat(quiz.solution2(8000000000l), is(8000000000l));

        assertThat(quiz.solution3(118372), is(873211l));
        assertThat(quiz.solution3(1l), is(1l));
        assertThat(quiz.solution3(8000000000l), is(8000000000l));


    }

}