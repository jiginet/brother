package com.jigi.kakao;

import java.util.List;

public class Question2 {

    public static int solution(List<Integer> arr) {
        int[] intArrays = arr.stream().mapToInt(Integer::intValue).toArray();

        int answer = -1;
        for (int i = 1; i < intArrays.length; i++) {
            if (intArrays[i] <= intArrays[i - 1]) continue;
            for (int j = i - 1; j >= 0; j--) {
                if (intArrays[j] >= intArrays[i]) break;
                int gap = intArrays[i] - intArrays[j];
                answer = gap > answer ? gap : answer;
            }
        }

        return answer;
    }

}
