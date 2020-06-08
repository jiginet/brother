package com.jigi.brother.array;

import java.util.*;

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

    public static int[] solution2(int N, int[] stages) {
        int[] answer = new int[N];
        Map<Integer, Double> map = new HashMap<>();

        // 배열의 값을 Map에 저장하는 과정
        for (int i = 0; i < stages.length; i++) {
            int key = stages[i];
            double value;
            if (key <= N) {
                if (!map.containsKey(key))
                    value = 0;
                else
                    value = map.get(stages[i]);
                map.put(key, ++value);
            }
        }

        // 실패율 값을 저장하는 과정
        int size = stages.length;
        for (int key = 1; key <= N; key++) {
            if (map.containsKey(key)) {
                double value = map.get(key);
                map.put(key, value / size);
                size -= value;
            } else {
                map.put(key, 0.0);
            }
        }

        // value에 따라 key를 정렬하는 과정
        List<Map.Entry<Integer, Double>> list = new ArrayList<>(map.entrySet());
        list.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));

        Map<Integer, Double> result = new LinkedHashMap<>();
        for (Map.Entry<Integer, Double> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }

        int n = 0;
        for (int key : result.keySet()) {
            System.out.println(key);
            answer[n] = key;
            n++;
        }

        return answer;
    }
}
