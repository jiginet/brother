package com.jigi.brother.combination;

import java.util.Arrays;

public class NumberBaseball {
    private final int size = 9 * 8 * 7;
    private final String[] supposeArray = new String[size];
    private int idx = 0;

    public int solution(int[][] baseball) {

        int n = 9;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] output = new int[n];
        boolean[] visited = new boolean[n];
        permutation(arr, output, visited, 0, n, 3);

        boolean[] isAnswer = new boolean[size];
        Arrays.fill(isAnswer, true);
        for (int i = 0; i < baseball.length; i++) {
            for (int j = 0; j < supposeArray.length; j++) {
                if (!isAnswer[j]) continue;
                int number = baseball[i][0];
                int strike = baseball[i][1];
                int ball = baseball[i][2];
                isAnswer[j] = playGame(supposeArray[j], number, strike, ball);
            }
        }

        int answer = 0;
        for (int i = 0; i < isAnswer.length; i++) {
            if (isAnswer[i]) {
                System.out.println(supposeArray[i]);
                answer++;
            }
        }

        return answer;
    }

    private boolean playGame(String supposeNumber, int number, int strike, int ball) {
        String num = String.valueOf(number);
        int ansStrike = 0;
        int ansBall = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j && supposeNumber.charAt(i) == num.charAt(j)) ansStrike++;
                else if (supposeNumber.charAt(i) == num.charAt(j)) ansBall++;
            }
        }
        return ansStrike == strike && ansBall == ball;
    }

    // 순열
    // 순서를 지키면서 n 개중에서 r 개를 뽑는 경우
    // 사용 예시: permutation(arr, output, visited, 0, n, 3);
    private void permutation(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
        if (depth == r) {
            StringBuilder number = new StringBuilder();
            for (int i = 0; i < r; i++) number.append(output[i]);
            supposeArray[idx++] = number.toString();
            return;
        }

        for (int i = 0; i < n; i++) {
            if (visited[i] != true) {
                visited[i] = true;
                output[depth] = arr[i];
                permutation(arr, output, visited, depth + 1, n, r);
                visited[i] = false;
            }
        }
    }
}
