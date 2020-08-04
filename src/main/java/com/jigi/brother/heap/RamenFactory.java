package com.jigi.brother.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class RamenFactory {
    public int solution(int stock, int[] dates, int[] supplies, int k) {

        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        int idx = 0;
        int answer = 0;
        for (int i = 1; i <= k; i++) {
            stock--;

            if (stock == 0 && i < k) {
                int j = idx;
                while (j < dates.length && dates[j] <= i) {
                    queue.offer(supplies[j]);
                    j++;
                }

                idx = j;
                answer++;
                stock += queue.poll();
            }

        }
        return answer;
    }
}
