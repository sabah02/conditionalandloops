package com.company;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter #: ");
        int n = in.nextInt();
        int new_n = n;
        int p = 0;
        while(new_n>0)
        {
            int r = new_n%10;
            p = p*10 + r;
            new_n/=10;
        }
        if(p==n)
        {
            System.out.print(p+" it is palindrome # ");
        }
        else
        {
            System.out.print(p+" it is not a palindrome # ");
        }
    }
}
