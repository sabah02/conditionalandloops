package com.company;

import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter total marks: ");
        int Tmarks = in.nextInt();
        System.out.print("Enter out of marks: ");
        int Omarks = in.nextInt();
        float per = (float)Tmarks/Omarks*100f;
        System.out.println("Percentage = " + per);
        float cgpa = per/9.5f;
        System.out.print("Your cgpa is -_- : "+ cgpa);
    }
}
