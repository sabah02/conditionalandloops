package com.company;

import java.util.Scanner;

public class Sumofdigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter #:");
        int On = in.nextInt();
        int sum = 0;
        int Dn = On;
        while(Dn>0)
        {
            int r = Dn%10;

            sum = sum + r;
            Dn/=10;
        }
        System.out.print("Sum of digits of "+ On + " is = " + sum );
    }
}
