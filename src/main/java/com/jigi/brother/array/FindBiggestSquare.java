package com.jigi.brother.array;

/**
 * DP(Dynamic Programming) 방식으로 풀어야 한다고 한다. 전체를 부분으로 나눠 전체의 해를 구하는 방식
 */
public class FindBiggestSquare {
    /**
     * 내가 푼 방식
     *
     * @param board
     * @return
     */
    public int solution(int[][] board) {

        int answer = 0;

        if (board.length < 2 || board[0].length < 2) return 1;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 1) {
                    if (i == 0 || j == 0) {
                        //answer = 1;
                        continue;
                    }
                    board[i][j] = Math.min(Math.min(board[i - 1][j], board[i][j - 1]), board[i - 1][j - 1]) + 1;
                    answer = board[i][j] > answer ? board[i][j] : answer;
                }
            }
        }

        return answer * answer;
    }

    /**
     * 다른 사람이 푼 방식
     *
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
