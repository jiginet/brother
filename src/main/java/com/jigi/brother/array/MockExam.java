package com.jigi.brother.array;

import java.util.Arrays;

/**
 * 모의고사
 * https://programmers.co.kr/learn/courses/30/lessons/42840
 */
public class MockExam {
    public int[] solution(int[] answers) {

        Student[] students = new Student[]{
                new Student(1, new int[]{1, 2, 3, 4, 5}),
                new Student(2, new int[]{2, 1, 2, 3, 2, 4, 2, 5}),
                new Student(3, new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5})
        };

        int max = 0;
        for (int i = 0; i < students.length; i++) {
            students[i].scoreAnswers(answers);
            if (students[i].getScore() > max) max = students[i].getScore();
        }

        final int maxScore = max;

        return Arrays.stream(students)
                .filter(std -> std.getScore() == maxScore)
                .mapToInt(s -> s.getStudentId())
                .sorted()
                .toArray();
    }

    private class Student {
        private int studentId;
        private int[] answers;
        private int score;

        public Student(int studentId, int[] answers) {
            this.studentId = studentId;
            this.answers = answers;
        }

        public void scoreAnswers(int[] correctAnswers) {
            for (int i = 0; i < correctAnswers.length; i++) {
                if (correctAnswers[i] == answers[i % answers.length]) score++;
            }
        }

        public int getStudentId() {
            return studentId;
        }

        public int getScore() {
            return score;
        }
    }
}
