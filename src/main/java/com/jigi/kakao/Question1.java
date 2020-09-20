package com.jigi.kakao;

public class Question1 {

    final static char[] LETTERS = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public static long solution(String s) {

        long answer = 0l;
        for (int i = 1; i < s.length(); i++) {
            answer += getDistance(s.charAt(i - 1), s.charAt(i));
        }

        return answer;

    }

    private static int getDistance(char l1, char l2) {
        final char first = l1 > l2 ? l2 : l1;
        final char second = l1 > l2 ? l1 : l2;

        return second - first > 26 + first - second ? 26 + first - second : 'Z' + first - second;
    }
}
