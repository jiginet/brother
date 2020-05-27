package com.jigi.brother.array;

import java.util.Stack;

public class UniqueNumber {
    public int[] solution(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        for (Integer i : arr) {
            if (stack.isEmpty() || !i.equals(stack.peek())) {
                stack.add(i);
            }
        }

        int[] answer = stack.stream().mapToInt(i -> i.intValue()).toArray();

        return answer;
    }
}
