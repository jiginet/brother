package com.jigi.brother.dfsNbfs;

import java.util.*;

/**
 * 단어변환
 * https://programmers.co.kr/learn/courses/30/lessons/43163
 */
public class WordReplace {

    // BFS로 풀이함
    public int solution(String begin, String target, String[] words) {

        int[] distance = new int[words.length];
        Queue<String> queue = new LinkedList<>();
        queue.offer(begin);

        Map<String, Integer> wordIndexes = new HashMap<>();
        for (int i = 0; i < words.length; i++) wordIndexes.put(words[i], i);

        int currentDistance = 0;
        while (!queue.isEmpty()) {
            String word = queue.poll();
            if (!word.equals(begin)) {
                int wordIndex = wordIndexes.get(word); // lookup 테이블(해시맵)을 사용하도록 변경
                currentDistance = distance[wordIndex];
            }

            for (int i = 0; i < words.length; i++) {
                if (distance[i] != 0) continue;
                if (isChangable(word, words[i])) {
                    distance[i] = currentDistance + 1;
                    queue.offer(words[i]);
                    if (words[i].equals(target)) return distance[i];
                }
            }
        }

        return 0;
    }

    private boolean isChangable(final String s1, final String s2) {
        int mismatchCount = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) mismatchCount++;
            if (mismatchCount > 1) return false;
        }
        return true;
    }

    // 다익스트라로 풀이함
    public int solution2(String begin, String target, String[] words) {

        final int targetIndex = Arrays.asList(words).indexOf(target);
        if (targetIndex == -1) return 0;

        final int wordsSize = words.length;
        boolean[] visited = new boolean[wordsSize];
        int[] distance = new int[wordsSize];
        Arrays.fill(distance, Integer.MAX_VALUE);

        for (int i = 0; i < wordsSize; i++) {
            if (isChangable(words[i], begin) && !visited[i]) {
                distance[i] = 1;
            }
        }

        for (int i = 0; i < wordsSize; i++) {
            int min = Integer.MAX_VALUE;
            int minIndex = -1;

            for (int j = 0; j < wordsSize; j++) {
                if (!visited[j] && distance[j] != Integer.MAX_VALUE) {
                    if (distance[j] < min) {
                        min = distance[j];
                        minIndex = j;
                    }
                }
            }

            if (words[minIndex].equals(target)) break;
            visited[minIndex] = true;

            for (int k = 0; k < wordsSize; k++) {
                if (!visited[k] && isChangable(words[minIndex], words[k])) {
                    if (distance[k] > distance[minIndex] + 1) {
                        distance[k] = distance[minIndex] + 1;
                    }
                }
            }
        }

        return distance[targetIndex];
    }
}
