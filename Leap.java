package com.company;

import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = in.nextInt();
        if((year%400==0||year%100!=0) && year%4==0)
        {
            System.out.print("LEAP YEAR *_* ");
        }
        else
        {
            System.out.print("NOT A LEAP YEAR *=*");
        }
    }
}
