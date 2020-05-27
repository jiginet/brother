package com.jigi.brother.string;

import java.util.Arrays;

public class SearchKim {

    public String solution(String[] seoul) {
        String answer = "김서방은 " + Arrays.asList(seoul).indexOf("Kim") + "에 있다";
        return answer;
    }


}
