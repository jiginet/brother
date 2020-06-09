package com.jigi.brother.stackNqueue;

import java.awt.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Printer {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<Point> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new Point(i, priorities[i]));
        }

        Arrays.sort(priorities);
        int n = priorities.length;
        int i = n - 1;

        while (!queue.isEmpty()) {
            Point job = queue.poll();
            if (job.y < priorities[i]) {
                queue.offer(job);
            } else {
                if (job.x == location) {
                    answer = n - i;
                    break;
                }
                i--;
            }
        }

        return answer;
    }

//    public int solution2(int[] priorities, int location) {
//        int answer = 0;
//
//
//        return answer;
//    }
}
