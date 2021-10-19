package com.company;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter #1: ");
        int n1 = in.nextInt();
        System.out.print("Enter #2: ");
        int n2 = in.nextInt();
        for(int i = 2 ; i<n2 ; i++)
        {
            if((n1%i==0)&&(n2%i==0))
            {
                System.out.print(i);
                break;
            }
        }
    }
}
