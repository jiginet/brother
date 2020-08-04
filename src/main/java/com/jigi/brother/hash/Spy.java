package com.jigi.brother.hash;

import java.util.HashMap;
import java.util.Map;

public class Spy {
    public int solution(String[][] clothes) {

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            int value = map.getOrDefault(clothes[i][1], 0);
            map.put(clothes[i][1], ++value);
        }

        int mul = 1;
        for (int value : map.values()) {
            mul *= (value + 1);
        }

        return mul - 1;
    }
}
