package com.jigi.brother.dfsNbfs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class NetworkTest {

    @Test
    @DisplayName("네트워크")
    void test1() {
        Network s = new Network();

        assertThat(s.solution(3,
                new int[][]{
                        {1, 1, 0},
                        {1, 1, 0},
                        {0, 0, 1}}),
                is(2));

        assertThat(s.solution(3,
                new int[][]{
                        {1, 1, 0},
                        {1, 1, 1},
                        {0, 1, 1}}),
                is(1));

        assertThat(s.solution(4,
                new int[][]{
                        {1, 1, 0, 0},
                        {1, 1, 1, 1},
                        {0, 1, 1, 0},
                        {0, 1, 0, 1}}),
                is(1));

        assertThat(s.solution(1,
                new int[][]{{1}}),
                is(1));

        assertThat(s.solution(5
                , new int[][]{
                        {1, 0, 1, 0, 0},
                        {0, 1, 0, 1, 0},
                        {1, 0, 1, 0, 0},
                        {0, 1, 0, 1, 0},
                        {0, 0, 0, 0, 1}
                }),
                is(3)
        );

    }
}
