package com.jigi.brother.number;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class UsableSquareTest {
    @Test
    void usableSquareTest() {

        UsableSquare quiz = new UsableSquare();

        assertThat(quiz.solution(8, 12), is(80L));
        assertThat(quiz.solution(12, 8), is(80L));
        assertThat(quiz.solution(1, 3), is(0L));
        assertThat(quiz.solution(3, 1), is(0L));
        assertThat(quiz.solution(2, 2), is(2L));

        assertThat(quiz.solution2(8, 12), is(80L));
        assertThat(quiz.solution2(12, 8), is(80L));
        assertThat(quiz.solution2(1, 3), is(0L));
        assertThat(quiz.solution2(3, 1), is(0L));
        assertThat(quiz.solution2(2, 2), is(2L));

        assertThat(quiz.solution3(8, 12), is(80L));
        assertThat(quiz.solution3(12, 8), is(80L));
        assertThat(quiz.solution3(1, 3), is(0L));
        assertThat(quiz.solution3(3, 1), is(0L));
        assertThat(quiz.solution3(2, 2), is(2L));


        System.out.println(BigInteger.valueOf(8l).gcd(BigInteger.valueOf(12l)).longValue());

    }
}