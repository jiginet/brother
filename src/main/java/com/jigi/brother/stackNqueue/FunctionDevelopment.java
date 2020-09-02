package com.jigi.brother.stackNqueue;

import java.util.*;

/**
 * 기능개발
 * https://programmers.co.kr/learn/courses/30/lessons/42586
 */
public class FunctionDevelopment {

    private class Work {
        private int progress;
        private int speed;

        public Work(int progress, int speed) {
            this.progress = progress;
            this.speed = speed;
        }

        public boolean isCompleted(int day) {
            return progress + speed * day >= 100;
        }
    }

    /**
     * 내가 푼 방식1
     */
    public int[] solution(int[] progresses, int[] speeds) {

        Queue<Work> queue = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            queue.offer(new Work(progresses[i], speeds[i]));
        }

        int day = 1;
        int count = 0;
        List<Integer> resultList = new ArrayList<>();
        while (!queue.isEmpty()) {
            if (queue.peek().isCompleted(day)) {
                queue.poll();
                count++;
                continue;
            }

            if (count > 0) {
                resultList.add(count);
                count = 0;
            }
            day++;
        }
        resultList.add(count);

        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }

    /**
     * 내가 푼 방식2
     */
    public int[] solution3(int[] progresses, int[] speeds) {

        Queue<Job> jobQueue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            jobQueue.offer(new Job(progresses[i], speeds[i]));
        }

        List<Integer> depolyJobs = new ArrayList<>();
        while (!jobQueue.isEmpty()) {
            for (Job job : jobQueue) {
                job.runningJob();
            }

            int completedJobs = 0;
            while (!jobQueue.isEmpty() && jobQueue.peek().completed) {
                completedJobs++;
                jobQueue.poll();
            }

            if (completedJobs > 0) depolyJobs.add(completedJobs);
        }

        return depolyJobs.stream().mapToInt(Integer::intValue).toArray();
    }

    class Job {
        int progress;
        int speed;
        boolean completed = false;

        public Job(int progress, int speed) {
            this.progress = progress;
            this.speed = speed;
        }

        private void runningJob() {
            if (progress < 100) {
                progress += speed;
            } else {
                completed = true;
            }
        }
    }

    /**
     * 다른 사람이 푼 방식
     *
     * @param progresses
     * @param speeds
     * @return
     */
    public int[] solution2(int[] progresses, int[] speeds) {
        int[] dayOfend = new int[100];
        int day = -1;
        for (int i = 0; i < progresses.length; i++) {
            while (progresses[i] + (day * speeds[i]) < 100) {
                day++;
            }
            dayOfend[day]++;
        }
        return Arrays.stream(dayOfend).filter(i -> i != 0).toArray();
    }

}
