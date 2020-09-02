package com.jigi.brother.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class WordChainTest {

    @Test
    @DisplayName("영어 끝말잇기")
    void wordChainTest() {
        WordChain quiz = new WordChain();

        String[] p1 = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        assertThat(quiz.solution(3, p1), is(new int[]{3, 3}));

        String[] p10 = {
                "hello", "observe", "effect", "take", "either", "recognize", "encourage"
                , "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
        assertThat(quiz.solution(5, p10), is(new int[]{0, 0}));

        String[] p100 = {"hello", "one", "even", "never", "now", "world", "draw"};
        assertThat(quiz.solution(2, p100), is(new int[]{1, 3}));
    }
}