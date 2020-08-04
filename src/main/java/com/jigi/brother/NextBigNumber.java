package com.jigi.brother;

/**
 * 다음 큰 숫자
 * https://programmers.co.kr/learn/courses/30/lessons/12911
 */
public class NextBigNumber {
    public int solution(int n) {

        long countNumberOne = countOne(n);

        int answer = n;
        while (answer > 0 && answer < 1000000) {
            if (countOne(++answer) == countNumberOne) {
                break;
            }
        }

        return answer;
    }

    private int countOne(int number) {
        String binary = Integer.toBinaryString(number);
        int count = 0;
        for (char c : binary.toCharArray()) {
            if (c == '1') count++;
        }
        return count;
    }


    public int solution2(int n) {

        String binaryNumber = Integer.toBinaryString(n);
        long countNumberOne = binaryNumber.chars().filter(c -> c == '1').count();

        int answer = n;

        while (answer > 0 && answer < 1000000) {
            String nextBinaryNumber = Integer.toBinaryString(++answer);
            long countNextNumberOne = nextBinaryNumber.chars().filter(c -> c == '1').count();

            if (countNextNumberOne == countNumberOne) {
                break;
            }
        }

        return answer;
    }
}