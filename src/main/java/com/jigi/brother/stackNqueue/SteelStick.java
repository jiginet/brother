package com.jigi.brother.stackNqueue;

import java.util.Stack;

public class SteelStick {

    private final char LASER_CHARCTER = 'I';

    /**
     * 내가 푼 방식, 3가지 방법 중 성능이 가장 안좋다. ㅠㅠ
     * @param arrangement
     * @return
     */
    public int solution(String arrangement) {

        Stack<Character> stack = new Stack<>();
        char[] array = arrangement.replaceAll("\\(\\)", String.valueOf(LASER_CHARCTER)).toCharArray();
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            char current = array[i];
            if (stack.isEmpty() && current == LASER_CHARCTER) continue;
            if (current == ')') {
                int count = 1;
                while (!stack.isEmpty()) {
                    char c = stack.pop();
                    if (c == LASER_CHARCTER) count++;
                    else if (c == '(') break;
                }
                answer += count;
                for (int j = 0; j < count - 1; j++) {
                    stack.push(LASER_CHARCTER);
                }
            } else {
                stack.push(current);
            }
        }

        return answer;
    }

    /**
     * 2번째로 성능이 우수한 방식 : 다른사람이 푼 방식 ㅠㅠ
     * @param arrangement
     * @return
     */
    public static int solution2(String arrangement) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arrangement.length(); i++) {
            if (arrangement.charAt(i) == '(') {
                st.push(i);
            } else if (arrangement.charAt(i) == ')') {
                if (st.peek() + 1 == i) {
                    st.pop();
                    answer += st.size();
                } else {
                    st.pop();
                    answer += 1;
                }
            }
        }
        return answer;
    }

    /**
     * 가장 우수한 성능을 보이는 풀이방식 : 다른사람이 푼 방식 ㅠㅠ
     * @param arrangement
     * @return
     */
    public static int solution3(String arrangement) {
        int answer = 0;
        int sticks = 0;

        char[] array = arrangement.replaceAll("\\(\\)", String.valueOf('I')).toCharArray();

        for (char c : array) {
            if (c == '(') sticks += 1;
            else if (c == 'I') answer += sticks;
            else {
                sticks -= 1;
                answer += 1;
            }
        }
        return answer;
    }

}
