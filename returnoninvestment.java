package com.company;

import java.util.Scanner;

public class returnoninvestment {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your present investment value: ");
        int PI = in.nextInt();
        System.out.print("rate of investment: ");
        int r = in.nextInt();
        System.out.print("after how much time you want to calculate the value of your investment : ");
        int t = in.nextInt();
        float FIV = PI*(1+(r/100f))*t;
        System.out.print("Your future investment value is: " + FIV);

    }
}
