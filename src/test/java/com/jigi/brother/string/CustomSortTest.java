package com.jigi.brother.string;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class CustomSortTest {

    @Test
    void customSortTest() {
        CustomSort quiz = new CustomSort();

        String[] p1 = {"sun", "bed", "car"};
        String[] r1 = {"car", "bed", "sun"};
        assertThat(quiz.solution(p1, 1), is(r1));

        String[] p2 = {"abce", "abcd", "cdx"};
        String[] r2 = {"abcd", "abce", "cdx"};
        assertThat(quiz.solution(p2, 2), is(r2));
    }
}