package com.company;

import java.util.Scanner;

public class Arectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter breadth of rectangle: ");
        int b = in.nextInt();
        System.out.print("Enter lenght of rectangle: ");
        int l = in.nextInt();
        int Rarea = b * l ;
        int Rperi = 2 *(l+b);
        System.out.println("AREA of rectangle is: "+ Rarea);
        System.out.println("Perimeter of rectangle is: "+Rperi);

    }
}
