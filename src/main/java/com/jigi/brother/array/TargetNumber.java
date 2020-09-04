package com.jigi.brother.array;

import java.util.LinkedList;
import java.util.Queue;

public class TargetNumber {
    public int solution(int[] numbers, int target) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(numbers[0]);
        queue.offer(-numbers[0]);
        for (int i = 1; i < numbers.length; i++) {
            int queueSize = queue.size();
            for (int j = 0; j < queueSize; j++) {
                int num = queue.poll();
                queue.offer(num + numbers[i]);
                queue.offer(num - numbers[i]);
            }
        }

        return (int) queue.stream().filter(i -> i.equals(target)).count();
    }

    public int solution2(int[] numbers, int target) {

        int answer = 0;
        int number = numbers[0];
        answer += recursive(number, numbers, 1, target);
        answer += recursive(-number, numbers, 1, target);

        return answer;
    }

    private int recursive(int sum, int[] array, int idx, int target) {

        if (idx >= array.length) {
            if (sum == target) return 1;
            else return 0;
        }

        int result = 0;
        int number = array[idx];
        result += recursive(sum + number, array, idx + 1, target);
        result += recursive(sum - number, array, idx + 1, target);

        return result;
    }

}
