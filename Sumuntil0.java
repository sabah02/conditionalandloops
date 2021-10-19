package com.company;

import java.util.Scanner;

public class Sumuntil0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter #: ");
        int max = 1;
        while(true)
        {
            int n = in.nextInt();

            if(n>max)
            {
                max=n;
            }

            if (n == 0)
            {
                System.out.print(max);
                break;
            }

        }

    }
}
