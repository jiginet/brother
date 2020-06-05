package com.jigi.brother.number;

public class StepNumbers {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for (int i = 0; i < n; i++) {
            answer[i] += (long)i * (long)x + (long)x;
        }

        return answer;
    }
}
