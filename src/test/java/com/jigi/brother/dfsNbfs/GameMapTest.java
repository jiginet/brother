package com.jigi.brother.dfsNbfs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class GameMapTest {

    @Test
    @DisplayName("게임맵 최단거리")
    void gameMapTest() {
        GameMap quiz = new GameMap();

        int[][] p1 = {
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1},
                {0, 0, 0, 0, 1}};
        assertThat(quiz.solution(p1), is(11));

        int[][] p2 = {
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 0},
                {0, 0, 0, 0, 1}};
        assertThat(quiz.solution(p2), is(-1));

        int[][] p3 = {
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1},
                {0, 0, 0, 0, 1}};
        assertThat(quiz.solution(p3), is(9));

    }
}