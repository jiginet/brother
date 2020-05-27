package com.jigi.brother.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class ExceptSmallestNumberTest {

    private final int BIG_NUMBER = 1000000;
    private int[] bigArray = new int[BIG_NUMBER];
    private int[] bigResultArray = new int[BIG_NUMBER - 1];

    @BeforeEach
    void setUp() {

        for (int i = 0; i < BIG_NUMBER; i++) {
            bigArray[i] = i;
            if (i != 0) bigResultArray[i - 1] = i;
        }

    }

    @Test
    void exceptSmallestNumberTest() {

        ExceptSmallestNumber quiz = new ExceptSmallestNumber();

        long begin = System.currentTimeMillis();
        assertThat(quiz.solution(new int[]{4, 3, 2, 1}), is(new int[]{4, 3, 2}));
        assertThat(quiz.solution(new int[]{1, 2, 3, 4}), is(new int[]{2, 3, 4}));
        assertThat(quiz.solution(new int[]{10}), is(new int[]{-1}));
        assertThat(quiz.solution(new int[]{}), is(new int[]{-1}));
        assertThat(quiz.solution(bigArray), is(bigResultArray));
        long end = System.currentTimeMillis();
        System.out.println("소요시간 : " + (end - begin) + "ms");

        begin = System.currentTimeMillis();
        assertThat(quiz.solution2(new int[]{4, 3, 2, 1}), is(new int[]{4, 3, 2}));
        assertThat(quiz.solution2(new int[]{1, 2, 3, 4}), is(new int[]{2, 3, 4}));
        assertThat(quiz.solution2(new int[]{10}), is(new int[]{-1}));
        assertThat(quiz.solution2(new int[]{}), is(new int[]{-1}));
        assertThat(quiz.solution2(bigArray), is(bigResultArray));
        end = System.currentTimeMillis();
        System.out.println("소요시간 : " + (end - begin) + "ms");

        begin = System.currentTimeMillis();
        assertThat(quiz.solution3(new int[]{4, 3, 2, 1}), is(new int[]{4, 3, 2}));
        assertThat(quiz.solution3(new int[]{1, 2, 3, 4}), is(new int[]{2, 3, 4}));
        assertThat(quiz.solution3(new int[]{10}), is(new int[]{-1}));
        assertThat(quiz.solution3(new int[]{}), is(new int[]{-1}));
        assertThat(quiz.solution3(bigArray), is(bigResultArray));
        end = System.currentTimeMillis();
        System.out.println("소요시간 : " + (end - begin) + "ms");
    }

}