package com.ZGh;

import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Please enter your desired number");
        String s = number.nextLine();
        String[] sArray = s.split("");
        for (int i = 0; i < sArray.length; i++) {
            System.out.print(sArray[i] + ": ");
            int counter = Integer.valueOf(sArray[i]);
            for (int j = 0; j < counter; j++) {
                System.out.print(counter);
            }
            System.out.println();

        }

    }
}
