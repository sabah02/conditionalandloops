package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input three numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max = b;
        if(a>max)
        {
            max=a;
        }
        else if(c>max)
        {
            max=c;
        }
        else
        {
            max=b;
        }
        System.out.println(max);
    }
}
