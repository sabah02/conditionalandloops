package com.company;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("ENTER #1: " );
        int n1 = in.nextInt();
        System.out.print("ENTER #2: " );
        int n2 = in.nextInt();
        for(int i = n2-1 ; i>0 ; i--)
        {
            if((n1%i==0)&&(n2%i==0))
            {
                System.out.print(i);
                break;
            }
        }
    }
}
