package com.company;

import java.util.Scanner;

public class Areaofcircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        float r = in.nextFloat();
        float area =  3.14f * r * r ;
        float perimeter = 2f * 3.14f * r ;
        System.out.println(area);
        System.out.println(perimeter);

    }
}
