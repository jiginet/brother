package com.jigi.brother.dfsNbfs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class WordReplaceTest {

    @Test
    @DisplayName("단어변환")
    void wordReplaceTest() {
        WordReplace quiz = new WordReplace();

        String[] array1 = {"hot", "dot", "dog", "lot", "log", "cog"};
        assertThat(quiz.solution("hit", "cog", array1), is(4));

        String[] array2 = {"hot", "dot", "dog", "lot", "log"};
        assertThat(quiz.solution("hit", "cog", array2), is(0));

        String[] array3 = {"aabbcc", "aabbdd", "aabbcd", "aabbee", "aabbff"};
        assertThat(quiz.solution("aabbbc", "aabbdd", array3), is(3));

        String[] array4 = {"hot", "dot", "dog", "lot", "log", "cog"};
        assertThat(quiz.solution("hit", "cog", array4), is(4));
    }

}
