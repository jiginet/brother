package com.jigi.brother.string;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class SkillTreeTest {

    @Test
    void skillTreeTest() {
        SkillTree quiz = new SkillTree();

        String p1 = "CBD";
        String[] p2 = {"BACDE", "CBADF", "AECB", "BDA"};
        assertThat(quiz.solution(p1, p2), is(2));

        String p10 = "CBD";
        String[] p20 = {"BACDE", "CBADF", "AECB", "C"};
        assertThat(quiz.solution(p10, p20), is(3));
    }

}