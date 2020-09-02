package com.jigi.brother.array;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42576
 * 완주하지 못한 선수
 */
public class NoFinishMarathon {
    public String solution(String[] participant, String[] completion) {

        Map<String, Integer> finishedPlayer = new HashMap();
        for (String player : completion) {
            finishedPlayer.put(player, finishedPlayer.getOrDefault(player, 0) + 1);
        }

        String answer = "";
        for (String player : participant) {
            if (finishedPlayer.getOrDefault(player, 0) == 0) {
                answer = player;
                break;
            } else {
                finishedPlayer.put(player, finishedPlayer.get(player) - 1);
            }
        }

        return answer;
    }

    public String solution2(String[] participant, String[] completion) {

        Arrays.sort(participant);
        Arrays.sort(completion);

        String answer = participant[participant.length - 1];
        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                answer = participant[i];
                break;
            }
        }

        return answer;
    }
}