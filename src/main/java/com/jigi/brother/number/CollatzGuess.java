package com.jigi.brother.number;

public class CollatzGuess {
    public int solution(int num) {

        int answer = 0;

        while (num > 1 && answer <= 500) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num * 3 + 1;
            }
            answer++;
        }

        return num == 1 && answer <= 500 ? answer : -1;
    }
}
