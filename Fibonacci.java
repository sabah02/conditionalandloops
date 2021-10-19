package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter starting values of fibonacci series: ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Enter the limit of series: ");
        int n = in.nextInt();

        for(int i = 2 ; i<=n ; i++)
        {
             int c = b;
             b = a+b;
             a = c;
        }
        System.out.println(b);

    }
}
