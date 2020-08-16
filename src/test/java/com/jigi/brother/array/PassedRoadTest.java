package com.jigi.brother.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class PassedRoadTest {

    @Test
    @DisplayName("방문 길이")
    void passedRoadTest() {

        PassedRoad quiz = new PassedRoad();
        assertThat(quiz.solution("LLLLLLL"), is(5));
        assertThat(quiz.solution("LLLLLLLRRRRRRRRRRRRRRRRR"), is(10));
        assertThat(quiz.solution("ULURRDLLU"), is(7));
        assertThat(quiz.solution("LURDLURDLURD"), is(4));
        assertThat(quiz.solution("LRLRUDUD"), is(2));
        assertThat(quiz.solution("LULLLLLLU"), is(7));
        assertThat(quiz.solution("LLLLLLLLLLLLLLLLLLLLL"), is(5));
        assertThat(quiz.solution("LLLLLLUUUUUURRRRRDDDDDLLLLLLRRRRRR"), is(21));
    }
}