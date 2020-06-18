package com.jigi.brother.greedy;

import java.util.Stack;

public class JoyStick {
    /**
     * 100점 만점에 66점, 다른방법을 찾아야 함
     * @param name
     * @return
     */
    public int solution(String name) {

        int n = name.length();
        Stack<Integer> stack = new Stack<>();
        char[] nameArray = name.toCharArray();

        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (nameArray[i] != 'A') {  // 문자를 변경시켜야 하는 경우(문자에 변화가 있는 경우)
                int previous = stack.isEmpty() ? 0 : stack.peek();
                int current = i;
                stack.push(i);
                // 좌우 이동거리 계산(앞 문자와 현재 문자와의 거리계산, 왼쪽으로 움직일 때와 오른쪽으로 움직일 때 어느 방향이 최소거리인지 찾는다)
                int moveLeftNRight = current - previous > n - i + previous ? n - i + previous : current - previous;
                answer += moveLeftNRight;

                // 위아래 이동거리 계산(순방향 A->B->C 와 역방향 A->Z->Y으로 문자열을 이동할 때 어느 방향이 최소거리인지 찾는다.)
                int moveUpNDown = (int) nameArray[i] - 'A' < (int) 'Z' + 1 - (int) nameArray[i] ? (int) nameArray[i] - 'A' : (int) 'Z' + 1 - (int) nameArray[i];
                answer += moveUpNDown;
            }
        }

        return answer;
    }
}
