package com.jigi.brother.array;

import java.util.HashSet;
import java.util.Set;

/**
 * 영어단어 끝말잇기
 * https://programmers.co.kr/learn/courses/30/lessons/12981
 */
public class WordChain {
    public int[] solution(int n, String[] words) {
        int[] answerCount = new int[n];
        Set<String> answerHistory = new HashSet<>();

        int[] answer = {0, 0};
        char lastLetter = findFirstLetter(words[0]);
        for (int i = 0; i < words.length; i++) {
            int peopleNumber = i % n;
            if (answerHistory.contains(words[i]) || findFirstLetter(words[i]) != lastLetter) {
                answer[0] = peopleNumber + 1;
                answer[1] = answerCount[peopleNumber] + 1;
                break;
            }
            answerCount[peopleNumber]++;
            answerHistory.add(words[i]);
            lastLetter = findLastLetter(words[i]);
        }

        return answer;
    }

    private char findLastLetter(String word) {
        return word.charAt(word.length() - 1);
    }

    private char findFirstLetter(String word) {
        return word.charAt(0);
    }
}
