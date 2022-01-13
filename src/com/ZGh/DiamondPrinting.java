package com.ZGh;

import java.util.Scanner;

public class DiamondPrinting {
    public static void main(String[] args) {
        Scanner nDiamond = new Scanner(System.in);
        System.out.println("Please enter n");
        int n = nDiamond.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");

            }
            System.out.println();

        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
