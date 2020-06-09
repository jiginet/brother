package com.jigi.brother.number;

import java.math.BigInteger;

public class UsableSquare {

    /**
     * 내가 구한방식, 최대공약수를 직접 구해 풀었음.
     *
     * @param w
     * @param h
     * @return
     */
    public long solution(int w, int h) {
        // 최대공약수 구하기 : 유클리드 호제법
        int gcd = 0;

        int a = Math.max(w, h);
        int b = Math.min(w, h);

        while (b > 0) {
            int r = a % b;
            if (r == 0) {
                gcd = b;
            }
            a = b;
            b = r;
        }

        // 사용불가능한 사각형의 개수
        int unUsable = ((w / gcd) + (h / gcd) - 1) * gcd;
        // 위 수식을 아래와 같이 더 간결하게 변경할 수 있다.
        // int unUsable = w + h - gcd;

        return ((long) w * (long) h - (long) unUsable);
    }

    /**
     * 다른사람이 푼 방식 : 최대공약수 함수를 이용했다. 더 빠르고 간단하다. ㅠ_ㅠ
     *
     * @param w
     * @param h
     * @return
     */
    public long solution2(int w, int h) {
        long totalCount = (long) w * (long) h;
        long diagonalCount = w + h - BigInteger.valueOf(w).gcd(BigInteger.valueOf(h)).longValue();

        return totalCount - diagonalCount;
    }
}
