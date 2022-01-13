package com.ZGh;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Please enter the beginning number");
        int a = number.nextInt();
        System.out.println("Please enter the end number");
        int b = number.nextInt();
        boolean primeFlag; //true if a number is prime
        int[] primeNumbers = new int[100];
        int c = 0;
        for (int i = a + 1; i < b; i++) {
            primeFlag = true;
            for (int j = i - 1; j > 1; j--) {
                if (i % j == 0) {
                    primeFlag = false;
                    break;
                }
            }
            if (primeFlag == true) {
                primeNumbers[c] = i;
                c++;
            }
        }

        for (int i = 0; i < c; i++) {
            System.out.print(primeNumbers[i]);
            if(i<c-1)
            System.out.print(",");
        }

    }
}
