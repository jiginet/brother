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
        assertThat(quiz.solution("ULURRDLLU"), is(7));

        quiz = new PassedRoad();
        assertThat(quiz.solution("LURDLURDLURD"), is(4));

        quiz = new PassedRoad();
        assertThat(quiz.solution("LRLRUDUD"), is(2));

        quiz = new PassedRoad();
        assertThat(quiz.solution("LULLLLLLU"), is(7));

        quiz = new PassedRoad();
        assertThat(quiz.solution("LLLLLLLLLLLLLLLLLLLLL"), is(5));

    }
}