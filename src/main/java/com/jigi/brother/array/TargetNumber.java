package com.jigi.brother.array;

public class TargetNumber {


    public int solution(int[] numbers, int target) {

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
