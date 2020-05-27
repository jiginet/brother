package com.jigi.brother.heap;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MoreSpicyTest {

    @Test
    void test1() {
        MoreSpicy s = new MoreSpicy();

        assertThat(s.solution(new int[]{1, 2, 3, 9, 10, 12}, 7), is(2));

        assertThat(s.solution(new int[]{7, 8, 9, 9, 10, 12}, 7), is(0));

        assertThat(s.solution(new int[]{0, 0, 0}, 1), is(-1));

        assertThat(s.solution(new int[]{0, 0, 0}, 0), is(0));

        assertThat(s.solution(new int[]{1, 1, 1}, 0), is(0));

        assertThat(s.solution(new int[]{0, 1, 2, 3}, 0), is(0));

        assertThat(s.solution(new int[]{0, 1, 2}, 1000), is(-1));

    }
}
