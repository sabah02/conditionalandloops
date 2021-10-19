package com.company;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = in.nextInt();
        System.out.print("Enter power:" );
        int pow = in.nextInt();
        int result  = 1;
        for(int i = 1 ; i<=pow ; i++)
        {
            result*=num;
        }
        System.out.print("Result = "+result );

    }
}
