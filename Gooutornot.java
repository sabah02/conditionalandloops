package com.company;

import java.util.Scanner;
/*	28. Kunal is allowed to go out with his friends only on the even days of a given month.
Write a program to count the number of days he can go out in the month of August.*/
public class Gooutornot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the month:");
        String m = in.nextLine();
        int days;
        int count = 0;
        if(m.equals("january")||m.equals("march")||m.equals("may")||m.equals("july")||m.equals("august")||m.equals("october")||m.equals("december"))
        {
            days=31;
        }
        else if(m.equals("feburary"))
        {
            days=28;
        }
        else
        {
            days=30;
        }
        for(int i = 1; i<=days ; i++)
        {
            if(i%2==0)
            {
                count++;
            }
        }
        System.out.print("# of days you can go out: " + count);

    }
}
