package com.company;

import java.util.Scanner;
/*Write a program to print the sum of negative numbers,
sum of positive even numbers and the sum of positive odd
numbers from a list of numbers (N) entered by the user.
The list terminates when the user enters a zero.*/
public class lastsum {

    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        while (true)
        {
            int n = in.nextInt();
            if(n<0)
            {
                sum1+=n;
            }
            if(n>0&&n%2==0)
            {
                sum2+=n;
            }
            if(n>0&&n%2!=0)
            {
                sum3+=n;
            }
            if(n==0)
            {
                break;
            }
        }
        System.out.println("Sum of negative integers is = " + sum1);
        System.out.println("Sum of positive even integers is = " + sum2);
        System.out.println("Sum of positive odd integers is = " + sum3);
    }
}
