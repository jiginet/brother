package com.jigi.brother.array;

import java.util.stream.IntStream;

public class ArrayAvg {
    public double solution(int[] arr) {
        double answer = IntStream.of(arr).average().orElse(0);
        return answer;
    }
}
