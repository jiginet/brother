package com.jigi.brother.string;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class StrangeWordTest {

    @Test
    void strangeWordTest() {
        StrangeWord quiz = new StrangeWord();

        assertThat(quiz.solution("try hello world"), is("TrY HeLlO WoRlD"));
    }

    @Test
    void stringBuilderVsStringBuffer() {
        StringBuilder builder = new StringBuilder();
        StringBuffer buffer = new StringBuffer();

        new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                buffer.append(1);
                builder.append(1);
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                builder.append(1);
                buffer.append(1);
            }
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("StringBuffer : " + buffer.length());
                System.out.println("StringBuilder " + builder.length());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}