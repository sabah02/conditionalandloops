package com.company;

import java.util.Scanner;

public class Perfectno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter #: ");
        int n = in.nextInt();
        int sum=0;
        for(int i = 1 ; i<n ; i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        if(sum==n)
        {
            System.out.println(n +" whose sum is " + sum +" is a perfect #");
        }
        else
        {
            System.out.println(n +" whose sum is " + sum +" is not a perfect #");
        }
    }
}
