package com.company;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        // the expression and case should have same data type
        // case cannot be repeated
        // use break
        Scanner in = new Scanner(System.in);
        String festival = in.next();
        switch(festival)
        {
            case "eid":
            {
                System.out.println("HAPPY EID");
                break;
            }
            case "diwali":
            {
                System.out.println("diwali ki badhai ho");
                break;
            }
            case "muharram":
            {
                System.out.print("Happy muharram");
                break;
            }
            case "dusshera":
            {
                System.out.print("Happy dussherra");
                break;
            }
            default:
                System.out.print("Please enter a valid festival");
        }

    }
}
