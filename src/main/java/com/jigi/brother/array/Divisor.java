package com.jigi.brother.array;

import java.util.ArrayList;
import java.util.List;

public class Divisor {
    public int[] solution(int[] arr, int divisor) {

        List<Integer> resultList = new ArrayList<>();

        for (int i : arr) {
            if (divisor != 0 && i % divisor == 0) {
                resultList.add(i);
            }
        }

        if (resultList.size() == 0) {
            return new int[]{-1};
        } else {
            return resultList.stream().mapToInt(Integer::intValue).sorted().toArray();
        }
    }
}
