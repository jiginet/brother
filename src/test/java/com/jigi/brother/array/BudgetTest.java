package com.jigi.brother.array;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class BudgetTest {

    @Test
    void budgetTest() {
        Budget quiz = new Budget();

        assertThat(quiz.solution(new int[]{1, 3, 2, 5, 4}, 9), is(3));
        assertThat(quiz.solution(new int[]{2, 2, 3, 3}, 10), is(4));
        assertThat(quiz.solution(new int[]{11, 12}, 10), is(0));

    }

}