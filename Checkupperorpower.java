package com.company;

import java.util.Scanner;

public class Checkupperorpower {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c = in.next().charAt(0);
        if( c <='Z' &&  c>='A')
        {
            System.out.println("Uppercase");
        }
        else{
            System.out.println("lowercase");
        }
//        String greeting = "hello";
//        System.out.println(greeting.charAt(4));
    }
}
