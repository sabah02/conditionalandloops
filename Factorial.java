package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter #: ");
        int n = in.nextInt();
        int i = n ;
        int fact = 1;
        while(i>1)
        {
            fact = fact * i ;
         i--;
        }
        System.out.print("factorial of "+ n + " is: " + fact );
    }
}
