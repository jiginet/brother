package com.jigi.brother.number;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class CommonDivisorNCommonMultipleTest {
    @Test
    void commonDivisorNCommonMultipleTest() {
        CommonDivisorNCommonMultiple quiz = new CommonDivisorNCommonMultiple();

        long begin = System.currentTimeMillis();
        assertThat(quiz.solution(3, 12), is(new int[]{3, 12}));
        assertThat(quiz.solution(2, 5), is(new int[]{1, 10}));
        assertThat(quiz.solution(6, 4), is(new int[]{2, 12}));
        assertThat(quiz.solution(9, 12), is(new int[]{3, 36}));
        assertThat(quiz.solution(9, 15), is(new int[]{3, 45}));
        assertThat(quiz.solution(1234, 1000000), is(new int[]{2, 617000000}));
        long end = System.currentTimeMillis();
        System.out.println("소요시간 : " + (end - begin) + " ms");


        begin = System.currentTimeMillis();
        assertThat(quiz.solution2(3, 12), is(new int[]{3, 12}));
        assertThat(quiz.solution2(2, 5), is(new int[]{1, 10}));
        assertThat(quiz.solution2(6, 4), is(new int[]{2, 12}));
        assertThat(quiz.solution2(9, 12), is(new int[]{3, 36}));
        assertThat(quiz.solution2(9, 15), is(new int[]{3, 45}));
        assertThat(quiz.solution2(1234, 1000000), is(new int[]{2, 617000000}));
        end = System.currentTimeMillis();
        System.out.println("소요시간 : " + (end - begin) + " ms");

        begin = System.currentTimeMillis();
        assertThat(quiz.solution3(3, 12), is(new int[]{3, 12}));
        assertThat(quiz.solution3(2, 5), is(new int[]{1, 10}));
        assertThat(quiz.solution3(6, 4), is(new int[]{2, 12}));
        assertThat(quiz.solution3(9, 12), is(new int[]{3, 36}));
        assertThat(quiz.solution3(9, 15), is(new int[]{3, 45}));
        assertThat(quiz.solution3(1234, 1000000), is(new int[]{2, 617000000}));
        end = System.currentTimeMillis();
        System.out.println("소요시간 : " + (end - begin) + " ms");

    }
}