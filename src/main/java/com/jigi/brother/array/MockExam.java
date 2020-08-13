package com.jigi.brother.array;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 모의고사
 * https://programmers.co.kr/learn/courses/30/lessons/42840
 */
public class MockExam {
    public int[] solution(int[] answers) {

        int[] correctAnswers = answers.clone();

        int[][] peoples = new int[][]{
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        int[] scores = new int[peoples.length];
        for (int i = 0; i < correctAnswers.length; i++) {
            for (int j = 0; j < peoples.length; j++) {
                if (correctAnswers[i] == peoples[j][i % peoples[j].length]) scores[j]++;
            }
        }

        int max = IntStream.of(scores).max().orElse(0);

        return IntStream.range(0, scores.length)
                .filter(i -> scores[i] == max)
                .mapToObj(i -> i + 1)
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
