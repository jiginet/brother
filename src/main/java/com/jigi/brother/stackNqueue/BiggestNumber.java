package com.jigi.brother.stackNqueue;

import java.util.Stack;
import java.util.stream.Collectors;

public class BiggestNumber {
    /**
     * 내가 푼 방식
     *
     * @param number
     * @param k
     * @return
     */
    public String solution(String number, int k) {

        Stack<Character> stack = new Stack<>();
        char[] numberArray = number.toCharArray();

        int i = 0, count = 0;
        while (count < k && i < number.length()) {
            if (stack.isEmpty()) {
                stack.push(numberArray[i]);
                i++;
            }

            if (stack.peek() < numberArray[i]) {
                stack.pop();
                count++;
                continue;
            } else {
                stack.push(numberArray[i]);
                i++;
                if (i == number.length()) {
                    while (count < k) {
                        stack.pop();
                        count++;
                    }
                }
            }
        }

        String s1 = stack.stream().map(String::valueOf).collect(Collectors.joining());
        String s2 = i < number.length() ? number.substring(i) : "";

        String answer = s1 + s2;
        return answer;
    }

    /**
     * 다른사람이 푼 방식, 간결하면서, 성능도 뛰어나다.
     *
     * @param number
     * @param k
     * @return
     */
    public String solution2(String number, int k) {
        char[] result = new char[number.length() - k];
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            while (!stack.isEmpty() && stack.peek() < c && k-- > 0) {
                stack.pop();
            }
            stack.push(c);
        }
        for (int i = 0; i < result.length; i++) {
            result[i] = stack.get(i);
        }
        return new String(result);
    }
}
