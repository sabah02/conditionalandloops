package com.company;

import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = in.nextInt();
        System.out.println("Enter digit: ");
        int d = in.nextInt();
        int count = 0;
        while(num>0)
        {
            int r=num%10;
            if(r==d)
            {
                count+=1;
            }
            num/=10;
        }
        System.out.println(count);
    }
}
