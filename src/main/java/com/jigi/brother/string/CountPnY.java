package com.jigi.brother.string;

public class CountPnY {
    boolean solution(String s) {
        int p = 0;
        int y = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if (c == 'p') p++;
            if (c == 'y') y++;
        }

        return p == y ? true : false;
    }
}
