package com.jigi.brother.array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * 모의고사
 *
 */
public class MockExam {
    public int[] solution(int[] answers) {

        int[] correctAnswers = answers.clone();

        int[] people1Answers = {1, 2, 3, 4, 5};
        int[] people2Answers = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] people3Answers = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] scores = {0, 0, 0};
        for (int i = 0; i < correctAnswers.length; i++) {
            if (correctAnswers[i] == people1Answers[i % people1Answers.length]) scores[0]++;
            if (correctAnswers[i] == people2Answers[i % people2Answers.length]) scores[1]++;
            if (correctAnswers[i] == people3Answers[i % people3Answers.length]) scores[2]++;
        }

        int max = IntStream.of(scores).max().orElse(0);

        List<Integer> maxAnswersList = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == max) maxAnswersList.add(i + 1);
        }

        return maxAnswersList.stream().mapToInt(Integer::intValue).toArray();
    }
}
