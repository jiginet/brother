package com.jigi.brother.array;

import java.util.Arrays;

public class NumberToReverseArray {
    public int[] solution(long n) {

        StringBuffer s = new StringBuffer(String.valueOf(n));
        s.reverse();

        int[] num = Arrays.asList(s.toString().split(""))
                .stream()
                .map(Integer::parseInt)
                .mapToInt(Integer::intValue)
                .toArray();

        return num;
    }
}
