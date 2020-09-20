package com.jigi.kakao;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class Question3Test {

    @Test
    @DisplayName("Question3")
    void test1() {
        Question3 quiz = new Question3();

        assertThat(quiz.solution(1000000000), is("1AA"));

        assertThat(quiz.solution(27), is("1AA"));

        assertThat(quiz.solution(703), is("2A"));

        assertThat(quiz.solution(702), is("1ZZ"));
    }

}