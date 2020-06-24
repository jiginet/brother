package com.jigi.brother.array;

import java.util.Stack;

/**
 * DP(Dynamic Programming) 방식으로 풀어야 한다고 한다. 전체를 부분으로 나눠 전체의 해를 구하는 방식
 */
public class FindBiggestSquare {
    /**
     * 내가 푼 방식, 36점이 나옴 ㅠㅠ
     * @param board
     * @return
     */
    public int solution(int[][] board) {
        Stack<Integer> stack = new Stack<>();
        int[][] colCount = new int[board.length][board[0].length];
        int[][] rowCount = new int[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 1 && colCount[i][j] == 0) {
                    if (stack.isEmpty()) stack.push(j);
                    else if (stack.peek() == j - 1) stack.push(j);
                    else {
                        int count = stack.size();
                        for (int k = 0; k < count; k++) {
                            int idx = stack.pop();
                            colCount[i][idx] = count;
                        }
                    }
                }
            }
            while (!stack.isEmpty()) {
                int count = stack.size();
                for (int k = 0; k < count; k++) {
                    int idx = stack.pop();
                    colCount[i][idx] = count;
                }
            }
        }

        for (int i = 0; i < board[0].length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] == 1 && rowCount[j][i] == 0) {
                    if (stack.isEmpty()) stack.push(j);
                    else if (stack.peek() == j - 1) stack.push(j);
                    else {
                        int count = stack.size();
                        for (int k = 0; k < count; k++) {
                            int idx = stack.pop();
                            rowCount[idx][i] = count;
                        }
                    }
                }
            }
            while (!stack.isEmpty()) {
                int count = stack.size();
                for (int k = 0; k < count; k++) {
                    int idx = stack.pop();
                    rowCount[idx][i] = count;
                }
            }
        }

        int answer = 0;

        for (int i = 0; i < colCount.length; i++) {
            for (int j = 0; j < colCount[0].length; j++) {
                int colMin = Math.min(colCount[i][j], colCount[0].length - j);
                int rowMin = Math.min(rowCount[i][j], rowCount.length - i);
                int min = Math.min(colMin, rowMin);
                if (min > answer) answer = min;
            }
        }

        return answer * answer;
    }

    /**
     * 다른 사람이 푼 방식
     * @param board
     * @return
     */
    public int solution2(int[][] board) {
        int answer = 0;
        int H = board.length;
        int W = board[0].length;
        int max = 0;

        // 둘중에 길이가
        if (H < 2 || W < 2) {
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if (board[i][j] == 1) {
                        max = 1;
                        break;
                    }
                }
            }
        } else {
            for (int i = 1; i < H; i++) {
                for (int j = 1; j < W; j++) {
                    if (board[i][j] == 0) continue;
                    board[i][j] = Math.min(Math.min(board[i - 1][j], board[i][j - 1]), board[i - 1][j - 1]) + 1;
                    if (board[i][j] > max)
                        max = board[i][j];
                }
            }
        }

        answer = max * max;
        return answer;
    }
}
