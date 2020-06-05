package com.jigi.brother.array;

public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            int sum = arr1[i] | arr2[i];
            String row = String.format("%" + n + "s", Integer.toBinaryString(sum));
            answer[i] = row.replaceAll("1", "#").replaceAll("0", " ");
        }
        return answer;
    }
}
