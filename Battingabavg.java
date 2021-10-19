package com.company;

import java.util.Scanner;

public class Battingabavg {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter total runs scored: ");
        int runs =  in.nextInt();
        System.out.print("Enter # of times a batter is out: ");
        int out = in.nextInt();
        float batting_avg = (float)runs/out;
        System.out.print("Batting avg of the batsman is: " + batting_avg);


    }
}
