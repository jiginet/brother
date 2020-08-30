package com.jigi.brother.stackNqueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42583
 * 다리를 지나는 트럭
 */
public class CrossingTruck {

    private class Truck {
        private final int weight;
        private int movingDistance;

        public Truck(int weight) {
            this.weight = weight;
        }

        public void crossBridge() {
            this.movingDistance++;
        }

        public boolean isCrossedBridge(int bridgeLength) {
            return movingDistance == bridgeLength;
        }

        public int getWeight() {
            return weight;
        }
    }

    /**
     * 내가 푼방식
     *
     * @param bridge_length
     * @param weight
     * @param truck_weights
     * @return
     */
    public int solution(int bridge_length, int weight, int[] truck_weights) {

        Queue<Truck> bridgeQueue = new LinkedList<>();
        Queue<Truck> waitingQueue = new LinkedList<>();

        for (int truckWeight : truck_weights) {
            waitingQueue.add(new Truck(truckWeight));
        }

        int seconds = 0;
        int sumTrucksWeight = 0;
        while (!waitingQueue.isEmpty() || !bridgeQueue.isEmpty()) {
            if (!waitingQueue.isEmpty() && waitingQueue.peek().getWeight() + sumTrucksWeight <= weight) {
                Truck truck = waitingQueue.poll();
                sumTrucksWeight += truck.getWeight();
                bridgeQueue.offer(truck);
            }

            for (Truck truck : bridgeQueue) truck.crossBridge();

            if (bridgeQueue.peek().isCrossedBridge(bridge_length)) {
                sumTrucksWeight -= bridgeQueue.poll().getWeight();
            }
            seconds++;
        }

        return seconds + 1;
    }


    /**
     * 다른사람이 푼 방식
     *
     * @param bridge_length
     * @param weight
     * @param truck_weights
     * @return
     */
    public int solution2(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int sum = 0, i = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int j = 0; j < bridge_length; j++) {
            q.offer(0);
        }
        while (!q.isEmpty()) {
            int popped = q.poll();
            sum -= popped;
            if (i < truck_weights.length) {
                if (sum + truck_weights[i] <= weight) {
                    q.offer(truck_weights[i]);
                    sum += truck_weights[i];
                    i++;
                } else {
                    q.offer(0);
                }
            }
            answer++;
        }
        return answer;
    }
}
