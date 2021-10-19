package com.company;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of x and y coordinates of point A: ");
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        System.out.print("Enter value of x and y coordinates of point B: ");
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        float distance = (float)Math.sqrt((x2-x1)*(x2-x1)+(y2 - y1)*(y2 - y1));
        System.out.print("Distance between two points is: " + distance);
    }
}

