package com.jigi.brother.stackNqueue;


import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class CraneGame {

    public int solution(int[][] board, int[] moves) {

        Map<Integer, Stack<Integer>> map = new HashMap<>();

        for (int i = 0; i < board.length; i++) {
            Stack<Integer> stack = new Stack<>();
            for (int j = board.length - 1; j >= 0; j--) {
                if (board[j][i] > 0) stack.push(board[j][i]);
            }
            map.put(i, stack);
        }

        Stack<Integer> basket = new Stack<>();
        int answer = 0;
        for (int i = 0; i < moves.length; i++) {
            Stack<Integer> stack = map.get(moves[i] - 1);

            if (!stack.isEmpty()) {
                int picked = stack.pop();
                if (basket.isEmpty()) {
                    basket.push(picked);
                } else {
                    if (basket.peek() == picked) {
                        basket.pop();
                        answer += 2;
                    } else {
                        basket.push(picked);
                    }
                }
            }
        }

        return answer;
    }

}
