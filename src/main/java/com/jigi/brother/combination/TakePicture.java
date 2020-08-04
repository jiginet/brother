package com.jigi.brother.combination;

import java.util.Arrays;

public class TakePicture {

    int size = 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1;
    private final String[] combinations = new String[size];
    private int idx = 0;

    public int solution(int n, String[] data) {
        int num = 8;
        char[] arr = {'A', 'C', 'F', 'J', 'M', 'N', 'R', 'T'};
        char[] output = new char[num];
        boolean[] visited = new boolean[num];
        permutation(arr, output, visited, 0, num, 8);

        boolean[] isAnswer = new boolean[size];
        Arrays.fill(isAnswer, true);

        for (int i = 0; i < size; i++) {
            if (isAnswer[i]) {
                for (int j = 0; j < data.length; j++) {
                    String one = String.valueOf(data[j].charAt(0));
                    String two = String.valueOf(data[j].charAt(2));
                    String sign = String.valueOf(data[j].charAt(3));
                    int gap = Integer.parseInt(String.valueOf(data[j].charAt(4)));

                    int max = Math.max(combinations[i].indexOf(two), combinations[i].indexOf(one));
                    int min = Math.min(combinations[i].indexOf(two), combinations[i].indexOf(one));

                    int checkGap = min == max ? 0 : max - min - 1;

                    if (">".equals(sign)) {
                        isAnswer[i] = checkGap > gap;
                    } else if ("<".equals(sign)) {
                        isAnswer[i] = checkGap < gap;
                    } else {
                        isAnswer[i] = checkGap == gap;
                    }
                    if (!isAnswer[i]) break;
                }
            }
        }
        idx = 0;

        int answer = 0;
        for (int i = 0; i < size; i++) {
            if (isAnswer[i]) answer++;
        }

        return answer;
    }

    // 사용 예시: permutation(arr, output, visited, 0, n, 8);
    private void permutation(char[] arr, char[] output, boolean[] visited, int depth, int n, int r) {
        if (depth == r) {
            StringBuilder number = new StringBuilder();
            for (int i = 0; i < r; i++) number.append(output[i]);
            combinations[idx++] = number.toString();
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

    /**
     * 다른사람이 푼 방식
     */
    static int ans;
    static char[] ch = new char[]{'A', 'C', 'F', 'J', 'M', 'N', 'R', 'T'};
    static String[] data;
    static int N;

    public int solution2(int n, String[] d) {
        ans = 0;
        N = n;
        data = d;
        permu(0, new boolean[8], new char[8]);
        return ans;
    }

    private static void permu(int s, boolean[] visitied, char[] arr) {
        if (s == 8) {
            if (check(arr)) ans++;
            return;
        }
        for (int i = 0; i < 8; i++) {
            if (!visitied[i]) {
                arr[s] = ch[i];
                visitied[i] = true;
                permu(s + 1, visitied, arr);
                visitied[i] = false;
            }
        }
    }

    private static boolean check(char[] arr) {
        for (String d : data) {
            char A = d.charAt(0);
            char B = d.charAt(2);
            int a = 0, b = 0;
            for (int i = 0; i < 8; i++) {
                if (arr[i] == A) a = i;
                else if (arr[i] == B) b = i;
            }
            int num = Integer.parseInt(d.charAt(4) + "") + 1;
            switch (d.charAt(3)) {
                case '=':
                    if (Math.abs(a - b) != num) return false;
                    break;
                case '<':
                    if (Math.abs(a - b) >= num) return false;
                    break;
                case '>':
                    if (Math.abs(a - b) <= num) return false;
            }
        }
        return true;
    }
}
