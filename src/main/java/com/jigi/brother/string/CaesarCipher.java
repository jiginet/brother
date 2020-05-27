package com.jigi.brother.string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CaesarCipher {
    public String solution(String s, int n) {


        String cipher = Arrays.stream(s.split("")).map(c -> {
            int code = c.charAt(0);
            if (Character.isSpaceChar(code)) {
                return " ";
            } else {
                int caesar;
                int a = 'a', z = 'z';
                if (Character.isUpperCase(code)) {
                    a = Character.toUpperCase(a);
                    z = Character.toUpperCase(z);
                }
                caesar = z - code >= n ? code + n : a + n - (z - code) - 1;
                return String.valueOf((char) caesar);
            }
        }).collect(Collectors.joining());

        return cipher;
    }
}
