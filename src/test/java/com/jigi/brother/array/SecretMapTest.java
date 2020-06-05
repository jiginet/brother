package com.jigi.brother.array;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class SecretMapTest {

    @Test
    void secretMapTest() {
        SecretMap quiz = new SecretMap();

        int p1 = 5;
        int[] p2 = new int[]{9, 20, 28, 18, 11};
        int[] p3 = new int[]{30, 1, 21, 17, 28};
        String[] r1 = new String[]{"#####", "# # #", "### #", "#  ##", "#####"};
        assertThat(quiz.solution(p1, p2, p3), is(r1));

        int p10 = 6;
        int[] p20 = new int[]{46, 33, 33, 22, 31, 50};
        int[] p30 = new int[]{27, 56, 19, 14, 14, 10};
        String[] r10 = new String[]{"######", "###  #", "##  ##", " #### ", " #####", "### # "};
        assertThat(quiz.solution(p10, p20, p30), is(r10));

        int p100 = 3;
        int[] p200 = new int[]{7, 7, 7};
        int[] p300 = new int[]{7, 7, 7};
        String[] r100 = new String[]{"###", "###", "###"};
        assertThat(quiz.solution(p100, p200, p300), is(r100));

        int p1000 = 4;
        int[] p2000 = new int[]{9, 0, 0, 0};
        int[] p3000 = new int[]{9, 0, 0, 0};
        String[] r1000 = new String[]{"#  #", "    ", "    ", "    "};
        assertThat(quiz.solution(p1000, p2000, p3000), is(r1000));


    }

}