package com.company;

import java.util.Scanner;

public class Subproductnsum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter #: ");
        int n = in.nextInt();
        int product = 1;
        int sum =  0;
        while(n>0)
        {
            int r = n%10;
            product*=r;
            sum+=r;
            n/=10;
        }
        int sub = product - sum ;
        System.out.println("sub = "+sub);


    }
}
