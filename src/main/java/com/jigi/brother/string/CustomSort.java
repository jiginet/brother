package com.jigi.brother.string;

import java.util.Arrays;
import java.util.Comparator;

public class CustomSort {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, Comparator.naturalOrder());

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                char a1 = a.charAt(n);
                char b1 = b.charAt(n);

                return a1 - b1;
            }
        });

        return strings;
    }
}
