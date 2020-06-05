package com.jigi.brother.string;

import java.util.Arrays;
import java.util.Scanner;

public class StarSquare {
    public static void main(String[] args) {
        System.out.print("숫자 2개를 입력해주세요. (n m) : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        char[] stars = new char[a];
        Arrays.fill(stars, '*');

        for(int i=0; i<b;i++) {
            System.out.println(String.copyValueOf(stars));
        }
    }
}
