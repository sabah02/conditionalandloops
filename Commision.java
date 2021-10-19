package com.company;

import java.util.Scanner;

public class Commision {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Total sale: ");
        int sale = in.nextInt();
        System.out.print("Enter commission %: ");
        int com = in.nextInt();
        float comamt = com*sale/100f;
        System.out.print("Total amount of commission :"+ comamt + " rupees");

    }
}
