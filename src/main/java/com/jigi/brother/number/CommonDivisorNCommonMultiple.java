package com.jigi.brother.number;

import java.math.BigInteger;

public class CommonDivisorNCommonMultiple {
    
    // 성능이 가장 떨어짐
    public int[] solution(int n, int m) {

        if (n > m) {
            int temp = n;
            n = m;
            m = temp;
        }

        int commonDivisor = 0, commonMultiple = 0;

        for (int i = n; i >= 1; i--) {
            if (n % i == 0 && m % i == 0) {
                commonDivisor = i;
                commonMultiple = i * (n / i) * (m / i);
                break;
            }
        }

        return new int[]{commonDivisor, commonMultiple};
    }

    /**
     * BigInteger의 최대공약수 함수 gcd를 사용하는 방법, 성능이 2번째로 좋음
     *
     * @param n
     * @param m
     * @return
     */
    public int[] solution2(int n, int m) {

        BigInteger a = new BigInteger(String.valueOf(n));
        BigInteger b = new BigInteger(String.valueOf(m));
        BigInteger gcd = a.gcd(b);

        int[] answer = new int[2];
        answer[0] = gcd.intValue();
        answer[1] = n * m / answer[0];

        return answer;
    }

    /**
     * 유클리드 호제법을 이용한 방법 : 성능이 가장 좋음
     *
     * @param n
     * @param m
     * @return
     */
    public int[] solution3(int n, int m) {
        int[] answer = new int[2];

        int a = Math.max(m, n);
        int b = Math.min(m, n);

        while (b > 0) {
            int r = a % b;
            if (r == 0) {
                answer[0] = b;
                answer[1] = n * m / b;
            }
            a = b;
            b = r;
        }

        return answer;
    }
}
