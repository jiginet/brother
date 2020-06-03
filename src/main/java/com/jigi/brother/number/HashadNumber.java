package com.jigi.brother.number;

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
