package com.company;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter # to be checked: ");
        int original_n = in.nextInt();
        int sum = 0;
        int dupe_n = original_n;
        while(dupe_n>0)
        {
            int r = dupe_n%10;
            int cube = r*r*r;
            sum = sum + cube;
            dupe_n/=10;
        }
        if(sum==original_n) {
            System.out.print("it is an armstrong #");
        }
        else
        {
            System.out.print("it is NOT an armstrong #");
        }
    }
}
