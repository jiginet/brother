package com.jigi.brother.string;

public class PhoneNumberMasking {
    public String solution(String phone_number) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < phone_number.length() - 4; i++) {
            sb.append("*");
        }
        sb.append(phone_number.substring(phone_number.length() - 4));

        return sb.toString();
    }


    public String solution2(String phone_number) {

        return phone_number.substring(0, phone_number.length() - 4).replaceAll(".", "*")
                + phone_number.substring(phone_number.length() - 4);
    }

    public String solution3(String phone_number) {
        return phone_number.replaceAll(".(?=.{4})", "*");
    }
}
