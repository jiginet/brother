package com.jigi.brother.string;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


class PhoneNumberMaskingTest {
    @Test
    void phoneNumberMaskingTest() {

        PhoneNumberMasking quiz = new PhoneNumberMasking();

        assertThat(quiz.solution("01033334444"), is("*******4444"));
        assertThat(quiz.solution("027778888"), is("*****8888"));
        assertThat(quiz.solution("1234"), is("1234"));

        assertThat(quiz.solution2("01033334444"), is("*******4444"));
        assertThat(quiz.solution2("027778888"), is("*****8888"));
        assertThat(quiz.solution2("1234"), is("1234"));

        assertThat(quiz.solution3("01033334444"), is("*******4444"));
        assertThat(quiz.solution3("027778888"), is("*****8888"));
        assertThat(quiz.solution3("1234"), is("1234"));

    }
}