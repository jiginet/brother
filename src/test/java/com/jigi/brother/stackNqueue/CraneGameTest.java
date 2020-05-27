package com.jigi.brother.stackNqueue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CraneGameTest {

    @Test
    void craneGameTest() {

        CraneGame quiz = new CraneGame();

        int[][] board1 = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}};
        int[] moves1 = {1, 5, 3, 5, 1, 2, 1, 4};

        assertEquals(4, quiz.solution(board1, moves1));


        int[][] board2 = {
                {1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {9, 9, 9, 9, 9, 9}
        };
        int[] moves2 = {1, 2, 3, 4, 5, 6};

        assertEquals(6, quiz.solution(board2, moves2));

    }
}