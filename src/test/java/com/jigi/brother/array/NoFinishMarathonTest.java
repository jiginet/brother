package com.jigi.brother.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class NoFinishMarathonTest {

    @Test
    @DisplayName("완주하지 못한 선수")
    void solveQuiz() {

        NoFinishMarathon quiz = new NoFinishMarathon();
        assertThat(quiz.solution(
                new String[]{"leo", "kiki", "eden"},
                new String[]{"eden", "kiki"}),
                is("leo")
        );

        assertThat(quiz.solution2(
                new String[]{"leo", "kiki", "eden"},
                new String[]{"eden", "kiki"}),
                is("leo")
        );


        assertThat(quiz.solution(
                new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},
                new String[]{"josipa", "filipa", "marina", "nikola"}),
                is("vinko")
        );

        assertThat(quiz.solution2(
                new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},
                new String[]{"josipa", "filipa", "marina", "nikola"}),
                is("vinko")
        );

        assertThat(quiz.solution(
                new String[]{"mislav", "stanko", "mislav", "ana"},
                new String[]{"stanko", "ana", "mislav"}),
                is("mislav")
        );

        assertThat(quiz.solution2(
                new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},
                new String[]{"josipa", "filipa", "marina", "nikola"}),
                is("vinko")
        );
    }

}