package com.company;

import java.util.Scanner;

public class Aparallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base of parallelogram: ");
        int b = in.nextInt();
        System.out.print("Enter height of parallelogram: ");
        int h = in.nextInt();
        System.out.println("Enter side of parallelogram: ");
        int a = in.nextInt();
        float Apara = (float)(b*h)/2;
        float Ppara = (float)(a + b )/2;
        System.out.println("Area of parallelogram is: " + Apara);
        System.out.print("PERIMETER of parallelgram is: "+Ppara);
    }
}
