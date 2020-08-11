package com.jigi.brother.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class KthNumberTest {

    @Test
    @DisplayName("K번째 수")
    void kthNumberTest() {

        KthNumber quiz = new KthNumber();

        int[] p1 = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] p2 = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        assertThat(quiz.solution(p1, p2), is(new int[]{5, 6, 3}));
    }

}