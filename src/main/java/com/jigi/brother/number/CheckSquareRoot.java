package com.jigi.brother.number;

public class CheckSquareRoot {
    public long solution(long n) {
        double squareRoot = Math.sqrt(n);
        return squareRoot == (int) squareRoot ? (long) Math.pow(squareRoot + 1, 2) : -1l;
    }
}
