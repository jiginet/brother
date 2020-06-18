package com.jigi.brother.greedy;

import java.util.Arrays;

public class Lifeboat {
    public int solution(int[] people, int limit) {

        Arrays.sort(people);
        int answer = 0;
        for (int i = 0, j = people.length - 1; i <= j; ) {
            int min = people[i];
            int max = people[j];

            if (min + max <= limit) {
                i++;
                j--;
            } else {
                j--;
            }
            answer++;
        }

        return answer;
    }


    /**
     * 다른 사람이 푼 방식
     *
     * @param people
     * @param limit
     * @return
     */
    public int solution2(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0, j = people.length - 1;
        for (; i < j; --j) {
            if (people[i] + people[j] <= limit)
                ++i;
        }
        return people.length - i;
    }
}
