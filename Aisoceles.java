package com.company;

import java.util.Scanner;

public class Aisoceles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base of triangle: ");
        int b = in.nextInt();
        System.out.print("Enter height of triangle: ");
        int h = in.nextInt();
        float Iarea = (b*h)/2;
        System.out.println("AREA of isosceles triangle is: "+Iarea);
    }
}
