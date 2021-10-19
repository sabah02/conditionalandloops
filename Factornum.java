package com.company;

import java.util.Scanner;

public class Factornum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter #: ");
        int n = in.nextInt();
        int i = 1;
        while(i<n)
        {
            if(n%i==0)
            {
                System.out.println(i);
            }
            i++;
        }
    }
}
