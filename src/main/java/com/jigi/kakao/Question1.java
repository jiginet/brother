package com.jigi.kakao;

public class Question1 {

    public static long solution(String s) {
        long answer = 0l;
        for (int i = 1; i < s.length(); i++) {
            answer += getDistance(s.charAt(i - 1), s.charAt(i));
        }
        return answer;
    }

    private static int getDistance(char letter1, char letter2) {
        final char first = letter1 > letter2 ? letter2 : letter1;
        final char second = letter1 > letter2 ? letter1 : letter2;
        int forwardDistance = second - first;
        int backwardDistance = first - 'A' + 'Z' - second + 1;
        return forwardDistance > backwardDistance ? backwardDistance : forwardDistance;
    }
}
