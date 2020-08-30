package com.jigi.brother.heap;

import lombok.extern.slf4j.Slf4j;

import java.util.Comparator;
import java.util.PriorityQueue;

@Slf4j
public class RamenFactory {

    public int solution(int stock, int[] dates, int[] supplies, int k) {

        PriorityQueue<Integer> suppliesQueue = new PriorityQueue<>(Comparator.reverseOrder());

        int answer = 0;
        int supplyDay = 0;
        for (int day = 1; day < k; day++) {
            stock--;
            if (supplyDay < dates.length && dates[supplyDay] == day) {
                suppliesQueue.offer(supplies[supplyDay]);
                supplyDay++;
            }
            if (stock == 0) {
                stock = suppliesQueue.poll();
                answer++;
            }
        }

        return answer;
    }

}
