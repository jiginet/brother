package com.jigi.brother.string;

public class StrangeWord {
    public String solution(String s) {

        StringBuilder answer = new StringBuilder();

        boolean isEven = true;
        for(char c : s.toCharArray()) {
            if (Character.isSpaceChar(c)) isEven = false;
            char a = isEven ? Character.toUpperCase(c) : Character.toLowerCase(c);
            answer.append(a);
            isEven = isEven ? false : true;
        }

        return answer.toString();
    }
}
