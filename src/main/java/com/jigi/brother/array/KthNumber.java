package com.jigi.brother.array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * K번째 수
 * https://programmers.co.kr/learn/courses/30/lessons/42748
 */
public class KthNumber {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> result = new ArrayList<>();

        for (int[] cmd : commands) {
            int[] slicedArray = Arrays.copyOfRange(array, (cmd[0] - 1), cmd[1]);
            Arrays.sort(slicedArray);
            result.add(slicedArray[(cmd[2] - 1)]);
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
