package com.jigi.brother.string;

/**
 * 다음 큰 숫자
 * https://programmers.co.kr/learn/courses/30/lessons/12911
 */
public class NextBigNumber {
    public int solution(int n) {

        int countOne = countOneByShift(n);

        int answer = n;
        while (countOneByShift(++answer) != countOne) ;

        return answer;
    }

    private int countOneByShift(int i) {
        int n = i;
        int count = 0;

        while (n > 0) {
            if ((n & 1) == 1) count++;
            n >>>= 1;
        }

        return count;
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