package com.company;

import java.util.Scanner;

public class SumofN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = in.nextInt();
        int sum = 0 ;
        for(int i = 1 ; i <=n ; i++)
        {
            int num = in.nextInt();
            sum = sum + num;
        }
        int Fsum = n*(n+1)/2;
        System.out.println("SUM of " + n + " # is = " + sum);
        System.out.print("SUM of " + n + " # is = " + Fsum);
    }
}
