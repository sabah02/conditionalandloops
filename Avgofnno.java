package com.company;

import java.util.Scanner;

public class Avgofnno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        int sum = 0;
        for(int i = 1 ; i<=n ; i++)
        {
            int num = in.nextInt();
            sum = sum + num ;
        }
        System.out.println("sum:" + sum );
        float avg = (float)sum/n;
        System.out.print("Average : " + avg);

    }
}
