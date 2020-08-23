package com.jigi.brother.combination;

/**
 * 소수만들기
 * https://programmers.co.kr/learn/courses/30/lessons/12977
 */
public class MakePrime {

    public int solution(int[] nums) {

        int[] answer = new int[]{0};

        int size = nums.length;
        boolean[] visited = new boolean[size];
        combination(nums, visited, 0, size, 3, answer);

        return answer[0];
    }

    // 조합(순서는 고려하지 않고, n개 중에 r개를 뽑는다)
    private void combination(int[] arr, boolean[] visited, int start, int n, int r, int[] result) {
        if (r == 0) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    sum += arr[i];
                }
            }
            if (isPrime(sum)) result[0]++;
            return;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1, result);
            visited[i] = false;
        }
    }

    // 소수판별
    private boolean isPrime(int num) {
        final int size = (int) Math.sqrt(num);

        for (int i = 2; i <= size; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}
