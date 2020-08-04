package com.jigi.brother.combination;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class TakePictureTest {
    @Test
    void takePictureTest() {

        TakePicture quiz = new TakePicture();

        String[] p1 = {"N~F=0", "R~T>2"};
        assertThat(quiz.solution(2, p1), is(3648));
        assertThat(quiz.solution2(2, p1), is(3648));

        String[] p10 = {"M~C<2", "C~M>1"};
        assertThat(quiz.solution(2, p10), is(0));
        assertThat(quiz.solution2(2, p10), is(0));
    }

}