package com.jigi.brother.search;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


class TwiceNTilingTest {
    @Test
    @DisplayName("2 x N 타일링")
    void twiceNTilingTest() {
        TwiceNTiling quiz = new TwiceNTiling();

        assertThat(quiz.solution(4), is(5));
        assertThat(quiz.solution2(4), is(5));

        assertThat(quiz.solution(5), is(8));
        assertThat(quiz.solution2(5), is(8));

        assertThat(quiz.solution(6), is(13));
        assertThat(quiz.solution2(6), is(13));
    }
}