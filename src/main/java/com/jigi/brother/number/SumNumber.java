package com.jigi.brother.number;

public class SumNumber {
    public long solution(int a, int b) {

        int n = Math.max(a, b) - Math.min(a, b) + 1;

        long answer = (long)n * ((long)a + (long)b) / 2;
        return answer;
    }
}
