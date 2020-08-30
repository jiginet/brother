package com.jigi.brother.hash;

import java.util.Arrays;

/**
 * 전화번호 목록
 * https://programmers.co.kr/learn/courses/30/lessons/42577
 */
public class PhoneBook {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);

        boolean answer = true;
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                answer = false;
                break;
            }
        }

        return answer;
    }
}
