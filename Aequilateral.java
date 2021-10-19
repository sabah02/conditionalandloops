package com.company;

import java.util.Scanner;

public class Aequilateral {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("Enter side of equi.triangle: ");
//        int a = in.nextInt();
//        double Aequilateral = Math.sqrt(3)*a*a/4;
//        System.out.print("Area of equilateral triangle is: " + Aequilateral);
         System.out.print("Enter side of equi.triangle: ");
         int a = in.nextInt();
         float P = 3 * a ;
         System.out.print("Perimeter of equi.triangle is: "+ P);

    }
}
