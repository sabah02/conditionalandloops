package com.company;

import java.util.Scanner;

public class Discout {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter price of product: ");
        int price = in.nextInt();
        System.out.print("Enter discount on product: ");
        int discount = in.nextInt();
       float Tdiscount = (float)(discount*price)/100f;
        System.out.print("YOUR discount amount will be: "+ Tdiscount + " rupees ");

    }
}
