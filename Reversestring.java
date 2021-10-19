package com.company;

import java.util.Scanner;

// Reverse a string
public class Reversestring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = input.next();
        String rev = "";
        for(int i=s.length()-1;i>=0;i--){
            rev = rev + s.charAt(i);
        }
        System.out.println("Reverse of String : "+rev);
    }
}




