package com.jigi.brother.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * 문제 : https://programmers.co.kr/learn/courses/30/lessons/42578
 * 위장
 */
public class Spy {
    public int solution(String[][] clothes) {

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            int value = map.getOrDefault(clothes[i][1], 0);
            map.put(clothes[i][1], ++value);
        }

        int combination = 1;
        for (int v : map.values()) {
            combination *= (v + 1);
        }

        return combination - 1;
    }
}
