package com.company;

import java.util.Scanner;
import java.lang.Math;
public class Compund {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        float p = in.nextFloat();
        System.out.print("Enter rate of interest: ");
        float r = in.nextFloat();
        System.out.print("Enter time : ");
        int t = in.nextInt();
        for (int i = 2 ; i <= t ; i++)
        {
            p = p + r*p/100f;
        }
        float CI = r*p/100;
        System.out.println("Principle  = " + p );
        System.out.println("CI = " + CI);
        System.out.print("Total amount = "+ (p + CI));

    }
}
