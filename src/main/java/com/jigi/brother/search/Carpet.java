package com.jigi.brother.search;

public class Carpet {
    public int[] solution(int brown, int yellow) {

        int[] answer = new int[2];

        int area = brown + yellow;
        int sqrt = (int) Math.sqrt(area);

        if (sqrt * sqrt == area) {
            answer[0] = sqrt;
            answer[1] = sqrt;
            return answer;
        } else {
            for (int row = 1; row <= sqrt; row++) {
                int col = area / row;
                if (col >= row && col * row == area && yellow == (col - 2) * (row - 2)) {
                    answer[0] = col;
                    answer[1] = row;
                    break;
                }
            }
            return answer;
        }
    }
}
