package com.jigi.brother.array;

import java.util.Arrays;

public class Budget {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        int sum = 0;
        for(int n : d) {
            if (sum + n <= budget) {
                sum += n;
                answer++;
            } else {
                break;
            }
        }

        return answer;
    }
}
