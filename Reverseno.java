package com.company;

import java.util.Scanner;

public class Reverseno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter #: ");
        int n = in.nextInt();
        int reverse = 0 ;
        while(n>0)
        {
            int r=n%10;
            reverse = reverse*10 + r;
            n/=10;
        }
        System.out.println(reverse);
    }
}
