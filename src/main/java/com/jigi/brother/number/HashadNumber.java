package com.jigi.brother.number;

/**
 * https://school.programmers.co.kr/courses/10586/lessons/67676
 */
public class HashadNumber {
    public boolean solution(int x) {
        int sum = 0;
        int y = x;
        while (y > 0) {
            sum += y % 10;
            y /= 10;
        }

        return x % sum == 0 ? true : false;
    }
}
