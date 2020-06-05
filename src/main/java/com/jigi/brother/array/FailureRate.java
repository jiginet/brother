package com.jigi.brother.array;

import java.util.HashMap;
import java.util.Map;

public class FailureRate {

    public int[] solution(int N, int[] stages) {

        int[] reached = new int[N + 1];
        int[] failed = new int[N + 1];

        for (int i = 0; i < stages.length; i++) {
            int stage = stages[i];
            if (stage == N + 1) {
                reached[stage - 1] += 1;
            } else {
                reached[stage] += 1;
                failed[stage] += 1;
            }
        }

        Map<Integer, Float> failureRate = new HashMap<>();
        for (int i = N; i >= 1; i--) {
            if (i < N) {
                reached[i] = reached[i] + reached[i + 1];
            }
            failureRate.put(i, (float) failed[i] / (float) reached[i]);
        }

        int[] answer = failureRate.entrySet().stream()
                .sorted((a, b) -> {
                    if (a.getValue() > b.getValue()) return -1;
                    else if (a.getValue() < b.getValue()) return 1;
                    else {
                        return a.getKey() > b.getKey() ? 1 : -1;
                    }
                })
                .mapToInt(Map.Entry::getKey)
                .toArray();

        return answer;
    }
}
