package com.jigi.brother.sort;

import java.util.Arrays;

public class HIndex {
    /**
     * 내가 푼 방식
     *
     * @param citations
     * @return
     */
    public int solution(int[] citations) {
        int n = citations.length;
        Arrays.sort(citations);

        int remain = n;
        int h = 0;
        for (int i = 0; i < n; i++) {
            remain--;
            if (i == 0) {
                h = Math.min(citations[i], n);
            } else {
                if (citations[i] <= remain + 1) {
                    h = citations[i];
                } else {
                    h = Math.max(Math.min(remain + 1, citations[i]), h);
                }
            }
        }

        return h;
    }

    /**
     * 다른 사람이 푼 방식, 더 간결하다.
     *
     * @param citations
     * @return
     */
    public int solution2(int[] citations) {
        int max = 0;
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            int min = Math.min(citations[i], citations.length - i);
            max = Math.max(max, min);
        }
        return max;
    }
}
