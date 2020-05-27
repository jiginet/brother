package com.jigi.brother.string;

public class StringPadding {
    public String solution(int n) {

        String answer = "";

        StringBuilder s = new StringBuilder();

        for (int i = 1; i <= n / 2; i++) {
            s.append("수박");
        }
        if (n % 2 == 1) {
            answer = s.append("수").toString();
        } else {
            answer = s.toString();
        }

        return answer;
    }
}
