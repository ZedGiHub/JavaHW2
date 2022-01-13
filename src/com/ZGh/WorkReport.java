package com.ZGh;

import java.util.Scanner;

public class WorkReport {

    public static void main(String[] args) {
        Scanner Values = new Scanner(System.in);
        System.out.println("Please enter number of bottles");
        int n = Values.nextInt();
        System.out.println("Please enter confidential liquid volume");
        int k = Values.nextInt();
        System.out.println("Now please enter the capacity of the bottles");
        float totalCap = 0;
        for (int i = 0; i < n; i++) {
            float c = Values.nextFloat();
            totalCap+=c;

        }
        //System.out.println(totalCap);
        if(totalCap<k)
            System.out.println("No");
        else
            System.out.println("Yes");


    }
}
