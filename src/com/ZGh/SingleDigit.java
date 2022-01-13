package com.ZGh;

import java.util.Scanner;

public class SingleDigit {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Please enter your desired number");
        String s = number.nextLine();
        String[] sArray = s.split("");

        long sum = 10;
        while (sum > 9) {
            sum = 0;
            for (int i = 0; i < sArray.length; i++) {
                sum = Integer.valueOf(sArray[i]) + sum;
            }
            s = String.valueOf(sum);
            sArray = s.split("");

        }

        System.out.println(sum);
    }
}
