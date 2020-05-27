package com.jigi.brother.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ExceptSmallestNumber {
    
    // 성능이 가장 안좋음 : 189ms
    public int[] solution(int[] arr) {
        int n = arr.length;

        if (n <= 1) {
            return new int[]{-1};
        } else {
            List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
            Integer min = Collections.min(list);
            list.remove(min);
            return list.stream().mapToInt(Integer::intValue).toArray();
        }
    }

    // 성능이 2번째로 좋음 : 182ms
    public int[] solution2(int[] arr) {

        List<Integer> list = new ArrayList<>();

        for (int i : arr) {
            list.add(i);
        }

        if (list.size() > 1) list.remove(Collections.min(list));
        return list.size() <= 1 ? new int[]{-1} : list.stream().mapToInt(Integer::intValue).toArray();
    }

    // 성능이 가장 좋음 : 129ms
    public int[] solution3(int[] arr) {
        if (arr.length <= 1) return new int[]{-1};
        int min = Arrays.stream(arr).min().getAsInt();

        return Arrays.stream(arr).filter(i -> i != min).toArray();
    }
}
