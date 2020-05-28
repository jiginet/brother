package com.jigi.brother.number;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class The124System {

    /**
     * 내풀이방법
     * @param n
     * @return
     */
    public String solution(int n) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "1");
        map.put(2, "2");
        map.put(3, "4");

        Stack<Integer> stack = new Stack<>();
        while (n >= 3) {
            int r = n % 3;
            if (r == 0) {
                r = 3;
                n = (n / 3) - 1;
            } else {
                n /= 3;
            }
            stack.push(r);
            if (n < 3 && n > 0) stack.push(n);
        }

        StringBuffer sb = new StringBuffer();
        while (!stack.empty()) {
            sb.append(map.get(stack.pop()));
        }

        return sb.length() == 0 ? String.valueOf(n) : sb.toString();
    }


    /**
     * 다른사람 해결방법
     * @param n
     * @return
     */
    public String solution2(int n) {
        String[] num = {"4","1","2"};
        String answer = "";

        while(n > 0){
            answer = num[n % 3] + answer;
            n = (n - 1) / 3;
        }
        return answer;
    }
}
