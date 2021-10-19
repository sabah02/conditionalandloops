package com.company;

import java.util.Scanner;

public class Areaoftriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter breadth of triangle: ");
       float b = in.nextInt();
       System.out.println("Enter height of triangle");
       float h = in.nextInt();
       float Tarea = (b * h)/2;
       System.out.println("AREA of triangle is: "+ Tarea);
    }

}
