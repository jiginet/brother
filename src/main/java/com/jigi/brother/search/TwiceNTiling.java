package com.jigi.brother.search;

import java.math.BigInteger;
import java.util.TreeMap;

/**
 * 2 x N 타일링
 * https://programmers.co.kr/learn/courses/30/lessons/12900
 */
public class TwiceNTiling {
    public int solution(int n) {

        TreeMap<Integer, BigInteger> factorialMap = new TreeMap<>();
        factorialMap.put(0, BigInteger.ONE);

        BigInteger combination = BigInteger.ONE;
        for (int i = 1; i <= n / 2; i++) {
            BigInteger digitNumber = getFactorial(factorialMap, n - i);
            BigInteger numberOfTwo = getFactorial(factorialMap, i);
            BigInteger numberOfOne = getFactorial(factorialMap, n - 2 * i);
            combination = combination.add(digitNumber.divide(numberOfTwo).divide(numberOfOne));
        }
        return combination.divideAndRemainder(BigInteger.valueOf(1000000007))[1].intValue();
    }

    private BigInteger getFactorial(TreeMap<Integer, BigInteger> factorialMap, int num) {
        if (factorialMap.get(num) != null) return factorialMap.get(num);

        int lastKey = factorialMap.lastKey();
        BigInteger factorial = factorialMap.get(lastKey);
        for (int i = lastKey + 1; i <= num; i++) {
            BigInteger idx = BigInteger.valueOf(i);
            factorial = factorial.multiply(idx);
            factorialMap.put(i, factorial);
        }
        return factorialMap.get(num);
    }


    // 다른 사람이 푼 방식 : 피보나치 수열을 이용하였음
    public int solution2(int n) {
        int a = 1;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int c = (a + b) % 1000000007;
            a = b;
            b = c;
        }
        return b;
    }
}
