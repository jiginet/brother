package com.jigi.brother.stackNqueue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class BiggestNumberTest {

    StringBuilder bigString = new StringBuilder();

    @BeforeEach
    void setUp() {
        for (int i = 0; i < 1000000; i++) {
            bigString.append(i % 9 + 1);
        }
    }

    @Test
    void biggestNumberTest() {

        BiggestNumber quiz = new BiggestNumber();

        assertThat(quiz.solution("1924", 2), is("94"));
        assertThat(quiz.solution("1231234", 3), is("3234"));
        assertThat(quiz.solution("4177252841", 4), is("775841"));
        assertThat(quiz.solution("10", 1), is("1"));
        assertThat(quiz.solution("123456791", 6), is("791"));
        assertThat(quiz.solution("87654321", 3), is("87654"));
        assertThat(quiz.solution("10000", 2), is("100"));
        assertThat(quiz.solution(bigString.toString(), 999999), is("9"));

        assertThat(quiz.solution2("1924", 2), is("94"));
        assertThat(quiz.solution2("1231234", 3), is("3234"));
        assertThat(quiz.solution2("4177252841", 4), is("775841"));
        assertThat(quiz.solution2("10", 1), is("1"));
        assertThat(quiz.solution2("123456791", 6), is("791"));
        assertThat(quiz.solution2("87654321", 3), is("87654"));
        assertThat(quiz.solution2("10000", 2), is("100"));
        assertThat(quiz.solution2(bigString.toString(), 999999), is("9"));
    }
}