package com.jigi.brother.stackNqueue;

import java.util.*;

public class FunctionDevelopment {

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
     * 내가 푼 방식
     * @param progresses
     * @param speeds
     * @return
     */
    public int[] solution(int[] progresses, int[] speeds) {

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


    /**
     * 다른 사람이 푼 방식
     * @param progresses
     * @param speeds
     * @return
     */
    public int[] solution2(int[] progresses, int[] speeds) {
        int[] dayOfend = new int[100];
        int day = -1;
        for(int i=0; i<progresses.length; i++) {
            while(progresses[i] + (day*speeds[i]) < 100) {
                day++;
            }
            dayOfend[day]++;
        }
        return Arrays.stream(dayOfend).filter(i -> i!=0).toArray();
    }

}
