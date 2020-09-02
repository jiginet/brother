package com.jigi.brother.stackNqueue;

/**
 * 주식가격
 * https://programmers.co.kr/learn/courses/30/lessons/42584
 */
public class StockPrice {

    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < answer.length; i++) {
            for (int j = i + 1; j < answer.length; j++) {
                if (prices[j] < prices[i]) {
                    answer[i]++;
                    break;
                }
                answer[i]++;
            }
        }

        return answer;
    }
}
