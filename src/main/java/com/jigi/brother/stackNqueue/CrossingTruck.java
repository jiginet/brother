package com.jigi.brother.stackNqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class CrossingTruck {

    class Truck {
        private final int weight;
        private int distance;

        public Truck(int weight, int distance) {
            this.weight = weight;
            this.distance = distance;
        }

        public int getWeight() {
            return weight;
        }

        public int getDistance() {
            return distance;
        }

        public void setDistance(int distance) {
            this.distance = distance;
        }
    }

    /**
     * 내가 푼 방식
     * @param bridge_length
     * @param weight
     * @param truck_weights
     * @return
     */
    public int solution(int bridge_length, int weight, int[] truck_weights) {

        BlockingQueue<Truck> bridge = new ArrayBlockingQueue<>(bridge_length);

        int n = 0;
        int answer = 0;
        int sumWeight = 0;
        int truckWeight = 0;
        do {
            answer++;
            if (bridge.peek() != null) {
                for (Truck t : bridge) {
                    t.setDistance(t.getDistance() + 1);
                }

                if (bridge.peek().getDistance() > bridge_length) {
                    Truck truck = bridge.poll();
                    sumWeight -= truck.getWeight();
                }
            }

            if (n < truck_weights.length) {
                truckWeight = truck_weights[n];
                if (weight >= truckWeight + sumWeight) {
                    Truck newTruck = new Truck(truckWeight, 1);
                    if (bridge.offer(newTruck)) {
                        sumWeight += truckWeight;
                        n++;
                    }
                }
            }
        } while (!bridge.isEmpty());

        return answer;
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
