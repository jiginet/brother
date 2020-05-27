package com.jigi.brother.string;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class DescendingStringTest {

    @Test
    void descendingStringTest() {

        DescendingString quiz = new DescendingString();

        assertThat(quiz.solution("Zbcdefg"), is("gfedcbZ"));

    }
}