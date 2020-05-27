package com.jigi.brother.heap;

import java.util.PriorityQueue;

public class MoreSpicy {

    public int solution(int[] scoville, int K) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        int min = 0, max = 0;
        for (int num : scoville) {
            if (min > num) min = num;
            if (max < num) max = num;
            queue.offer(num);
        }

        if (K == 0 && min > 0) {
            return 0;
        } else if (K > 0 && max == 0) {
            return -1;
        } else if (K == 0 && min == 0 && max == 0) {
            return 0;
        }

        int answer = 0;
        while (queue.size() > 1 && queue.peek() < K) {
            int x = queue.poll();
            int y = queue.poll();
            int score = x + (y * 2);
            answer++;
            if (queue.isEmpty()) {
                if (score < K) answer = -1;
            } else {
                queue.offer(score);
            }
        }
        return answer;
    }

}
