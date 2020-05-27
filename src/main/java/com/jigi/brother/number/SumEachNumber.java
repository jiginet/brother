package com.jigi.brother.number;

import java.util.Arrays;

public class SumEachNumber {
    public int solution(int n) {

        // 내가 만든코드1
//        int answer = Arrays.asList(Integer.toString(n).split(""))
//                .stream()
//                .map(Integer::parseInt)
//                .mapToInt(Integer::intValue)
//                .sum();

        // 내가 만든코드 2
//        int answer = Arrays.asList(Integer.toString(n).split(""))
//                .stream()
//                .map(Integer::parseInt)
//                .reduce((i, j) -> i + j)
//                .get();

        // 다른 개발자가 만든 코드
        int answer = 0;

        while (n > 0) {
            answer += n % 10;
            n = n / 10;
        }

        return answer;
    }
}
