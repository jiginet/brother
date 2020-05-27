package com.jigi.brother.number;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class DescendingNumber {
    public long solution(long n) {

        long answer = Long.parseLong(Arrays
                .stream((String.valueOf(n).split("")))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining()));

        return answer;
    }

    public long solution2(long n) {

        String[] result = String.valueOf(n).split("");
        Arrays.sort(result, Collections.reverseOrder());

        StringBuffer sb = new StringBuffer();

        for (String s : result) {
            sb.append(s);
        }

        return Long.parseLong(sb.toString());
    }

    public long solution3(long n) {

        StringBuffer sb = new StringBuffer();
        Long.toString(n).chars().sorted().forEach(l -> sb.insert(0, Character.toChars(l)));
        return Long.parseLong(sb.toString());
    }

}
