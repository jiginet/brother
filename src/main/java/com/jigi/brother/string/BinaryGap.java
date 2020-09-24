package com.jigi.brother.string;

public class BinaryGap {
    public int solution(int N) {

        String binaryString = Integer.toBinaryString(N);
        int oneCount = 0;
        int max = 0;
        int count = 0;
        for (char c : binaryString.toCharArray()) {
            if (c == '1') {
                oneCount++;
                max = count > max ? count : max;
                count = 0;
            } else {
                count++;
            }
        }
        return oneCount == 1 ? 0 : max;
    }
}
