package com.jigi.brother.hash;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class PhoneBookTest {

    @Test
    @DisplayName("전화번호 목록")
    void phoneBookTest() {
        PhoneBook quiz = new PhoneBook();

        String[] p1 = {"119", "97674223", "1195524421"};
        assertThat(quiz.solution(p1), is(false));

        String[] p2 = {"123", "456", "789"};
        assertThat(quiz.solution(p2), is(true));

        String[] p3 = {"12", "123", "1235", "567", "88"};
        assertThat(quiz.solution(p3), is(false));
    }

}