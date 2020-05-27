package com.jigi.brother.dfsNbfs;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class WordReplaceTest {

    @Test
    void wordReplaceTest() {
        WordReplace s = new WordReplace();

        String[] array1 = {"hot", "dot", "dog", "lot", "log", "cog"};
        assertThat(s.solution("hit", "cog", array1), is(4));

        System.out.println();

        String[] array2 = {"hot", "dot", "dog", "lot", "log"};
        assertThat(s.solution("hit", "cog", array2), is(0));

        System.out.println();

        String[] array3 = {"aabbcc", "aabbdd", "aabbcd", "aabbee", "aabbff"};
        assertThat(s.solution("aabbbc", "aabbdd", array3), is(3));

        System.out.println();

        String[] array4 = {"hot", "dot", "dog", "lot", "log", "cog"};
        assertThat(s.solution("hit", "cog", array4), is(4));
    }

}
