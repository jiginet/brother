package com.jigi.brother.heap;

import java.util.PriorityQueue;

/**
 * 더 맵게
 * https://programmers.co.kr/learn/courses/30/lessons/42626
 */
public class MoreSpicy {

    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int n : scoville) {
            queue.offer(n);
        }

        int answser = 0;
        while (queue.peek() < K && queue.size() > 1) {
            int s = queue.poll() + (queue.poll() * 2);
            queue.offer(s);
            answser++;
        }

        return queue.peek() >= K ? answser : -1;
    }
}
