package com.jigi.brother.string;

/**
 * 다음 큰 숫자
 * https://programmers.co.kr/learn/courses/30/lessons/12911
 */
public class NextBigNumber {
    public int solution(int n) {

        long countOne = countOneByDivide(n);

        int answer = n;
        while (0 < answer && answer < 1000000 && countOneByDivide(++answer) != countOne);

        return answer;
    }

    private int countOneByDivide(int i) {
        int n = i;
        int count = 0;

        while (n > 2) {
            if (n % 2 == 1) count++;
            n /= 2;
        }

        return count;
    }


    private int countOneByBinaryString(int number) {
        String binary = Integer.toBinaryString(number);
        int count = 0;
        for (char c : binary.toCharArray()) {
            if (c == '1') count++;
        }
        return count;
    }
}