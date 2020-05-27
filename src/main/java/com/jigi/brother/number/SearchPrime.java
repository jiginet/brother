package com.jigi.brother.number;

import java.util.stream.IntStream;

public class SearchPrime {

    public int solution(int n) {

        int[] prime = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            prime[i] = i;
        }

        for (int i = 2; i <= n; i++) {
            if (prime[i] == 0) continue;
            for (int j = i; j <= n; j += i) {
                if (i != j && j % i == 0) prime[j] = 0;
            }
        }

        return (int) IntStream.of(prime).filter(i -> i != 0).count();
    }
}
