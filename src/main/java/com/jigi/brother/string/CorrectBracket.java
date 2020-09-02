package com.jigi.brother.string;

public class CorrectBracket {
    boolean solution(String s) {
        int depth = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') depth++;
            else depth--;

            if (depth < 0) break;
        }

        return depth == 0;
    }
}
