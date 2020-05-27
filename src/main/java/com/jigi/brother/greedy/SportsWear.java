package com.jigi.brother.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class SportsWear {

    public int solution(int n, int[] lost, int[] reserve) {

        HashSet<Integer> lostList = new HashSet<>(Arrays.stream(lost).boxed().collect(Collectors.toList()));
        HashSet<Integer> reserveList = new HashSet<>(Arrays.stream(reserve).boxed().collect(Collectors.toList()));

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    lostList.remove(lost[i]);
                    reserveList.remove(lost[i]);
                }
            }
        }

        List<Integer> result = new ArrayList<>();

        for (int lostNum : lostList) {
            for (int reserveNum : reserveList) {
                if (!result.contains(reserveNum)) {
                    if (reserveNum == lostNum - 1 || reserveNum == lostNum + 1) {
                        result.add(reserveNum);
                        break;
                    }
                }
            }
        }

        int answer = n - lostList.size() + result.size();
        return answer;
    }
}
