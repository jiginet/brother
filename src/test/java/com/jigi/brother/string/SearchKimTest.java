package com.jigi.brother.string;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class SearchKimTest {

    @Test
    void searchStringTest() {

        SearchKim quiz = new SearchKim();

        String[] p1 = {"jane", "Kim"};
        assertThat(quiz.solution(p1), is("김서방은 1에 있다"));

    }
}