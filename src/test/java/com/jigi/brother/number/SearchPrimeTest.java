package com.jigi.brother.number;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class SearchPrimeTest {

    @Test
    void searchPrimeTest() {

        SearchPrime quiz = new SearchPrime();

        assertThat(quiz.solution(10), is(4));
        assertThat(quiz.solution(5), is(3));
    }
}