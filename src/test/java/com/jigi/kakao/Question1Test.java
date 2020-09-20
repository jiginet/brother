package com.jigi.kakao;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class Question1Test {

    @Test
    @DisplayName("Question1")
    void test1() {
        Question1 quiz = new Question1();

        assertThat(quiz.solution("AZ"), is(1L));

        assertThat(quiz.solution("AZGB"), is(13L));

        assertThat(quiz.solution("ZNMD"), is(23L));
    }
}