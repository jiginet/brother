package com.jigi.brother.string;

public class CenterLetters {
    public String solution(String s) {

        int idx = (int) Math.ceil((float) s.length() / 2);

        String answer = "";
        if (s.length() % 2 == 1) {
            answer = s.substring(idx - 1, idx);
        } else {
            answer = s.substring(idx - 1, idx + 1);
        }

        return answer;
    }
}
