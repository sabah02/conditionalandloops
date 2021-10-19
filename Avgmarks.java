package com.company;

import java.util.Scanner;

public class Avgmarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter marks in Programming : ");
        int p = in.nextInt();
        System.out.print("Enter marks in soft skills: ");
        int E = in.nextInt();
        System.out.print("Enter marks in OP: ");
        int OP = in.nextInt();
        System.out.print("Enter marks in Database: ");
        int DB = in.nextInt();
        System.out.print("Enter marks in Design: ");
        int D = in.nextInt();
        float avg = (float)p+E+OP+DB+D/5f;
        System.out.print("Average marks : " + avg);
    }
}
