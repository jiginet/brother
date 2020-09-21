package com.jigi.brother.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class SearchLyricsTest {
    @Test
    @DisplayName("가사 검색")
    void test() {

        SearchLyrics quiz = new SearchLyrics();
        String[] p1 = {"frodo", "front", "frost", "frozen", "frame", "kakao"};
        String[] p2 = {"fro??", "????o", "fr???", "fro???", "pro?"};
        assertThat(quiz.solution(p1, p2), is(new int[]{3, 2, 4, 1, 0}));


        String[] p10 = {"aa", "abc", "abd", "aabb", "aabbcc", "d"};
        String[] p20 = {"a?", "?", "?a", "aa?", "aa??", "a?"};
        assertThat(quiz.solution(p10, p20), is(new int[]{1, 1, 1, 0, 1, 1}));
    }
}