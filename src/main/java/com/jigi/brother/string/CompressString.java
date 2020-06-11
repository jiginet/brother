package com.jigi.brother.string;


public class CompressString {
    public int solution(String s) {

        int sSize = s.length();
        int answer = sSize;

        for (int i = sSize / 2; i >= 1; i--) {
            int count = 1;
            StringBuilder compressed = new StringBuilder();

            for (int j = 0; j < sSize; j += i) {
                int start = j;
                int end = j + i > sSize ? sSize : j + i;
                int nextStart = end;
                int nextEnd = nextStart + i > sSize ? sSize : nextStart + i;

                String current = s.substring(start, end);
                String next = s.substring(nextStart, nextEnd);

                if (current.equals(next)) count++;
                else {
                    compressed.append(count == 1 ? "" : count).append(current);
                    count = 1;
                }
            }
            int compressedSize = compressed.length();
            if (compressedSize < answer) answer = compressedSize;

        }

        return answer;
    }
}
