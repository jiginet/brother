package com.jigi.brother.stackNqueue;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class PrinterTest {

    @Test
    void printerTest() {

        Printer quiz = new Printer();

        int[] p1 = {2, 1, 3, 2};
        int p2 = 2;
        int r1 = 1;
        assertThat(quiz.solution(p1, p2), is(r1));

        int[] p10 = {1, 1, 9, 1, 1, 1};
        int p20 = 0;
        int r10 = 5;
        assertThat(quiz.solution(p10, p20), is(r10));

        int[] p100 = {2,2,9,2,1};
        int p200 = 1;
        int r100 = 4;
        assertThat(quiz.solution(p100, p200), is(r100));

    }

}