package com.jigi.brother.stackNqueue;

import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;

public class CrossingTruck {

    public int solution(int bridge_length, int weight, int[] truck_weights) {

        // 아직 미구현 : 구현해야 함

        int answer = 0;
        return answer;
    }

    // 백트래킹 사용
    // 사용 예시 : combination(arr, visited, 0, n, r)
    private void combination(int[] arr, boolean[] visited, int start, int n, int r) {
        if (r == 0) {
            System.out.println(arr);
            return;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }

}
