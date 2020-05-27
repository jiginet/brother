package com.jigi.brother.string;


import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DescendingString {
    public String solution(String s) {

        String answer = Stream.of(s.split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());

        return answer;
    }

}
