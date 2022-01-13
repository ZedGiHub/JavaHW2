package com.ZGh;

import java.util.Arrays;
import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner PN = new Scanner(System.in);
        System.out.println("Please enter n");
        int n = PN.nextInt();
        int[] PT = new int[12];
        int[] PT2 = new int[12];
        PT[0] = 0;
        PT[1] = 1;
        PT[2] = 0;
        if (n > 0)
            System.out.println(1);
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < i + 2; j++) {
                PT2[j + 1] = PT[j] + PT[j + 1];
                System.out.print(PT2[j + 1] + " ");

            }
            PT = Arrays.copyOf(PT2, PT2.length);
            System.out.println();
        }
    }
}
