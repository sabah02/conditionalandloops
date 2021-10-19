package com.company;

import java.util.Scanner;

public class Arhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter diagonals of parallogram: ");
        int d1 = in.nextInt();
        int d2 = in.nextInt();
        float Arhombus = (d1*d2)/(float)2;
        System.out.print("Enter side : ");
        int a = in.nextInt();
        float Prhombus = 4*a;
        System.out.println("Area of rhombus is: "+ Arhombus);
        System.out.println("Perimeter of rhombus is: "+ Prhombus);
    }
}
