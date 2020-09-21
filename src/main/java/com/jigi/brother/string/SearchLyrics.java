package com.jigi.brother.string;

import java.util.HashMap;
import java.util.Map;

/**
 * 가사 검색
 * https://programmers.co.kr/learn/courses/30/lessons/60060
 */
public class SearchLyrics {
    public int[] solution(String[] words, String[] queries) {

        Map<String, Integer> queriesMap = new HashMap<>();

        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            if (queriesMap.get(queries[i]) != null) {
                answer[i] = queriesMap.get(queries[i]);
                continue;
            }
            int count = countWord(words, queries[i]);
            answer[i] = count;
            queriesMap.put(queries[i], count);
        }

        return answer;
    }

    private int countWord(String[] words, String query) {
        int count = 0;

        for (String word : words) {
            if (word.length() != query.length()) continue;

            boolean check = true;
            if (query.charAt(0) == '?') {
                for (int i = query.length() - 1; i >= 0; i--) {
                    if (query.charAt(i) == '?') break;
                    if (query.charAt(i) != word.charAt(i)) {
                        check = false;
                        break;
                    }
                }
            } else {
                for (int i = 0; i < query.length(); i++) {
                    if (query.charAt(i) == '?') break;
                    if (query.charAt(i) != word.charAt(i)) {
                        check = false;
                        break;
                    }
                }
            }
            if (check) count++;
        }
        return count;
    }
}
