package com.company;

import java.util.Scanner;

public class Depriciation {
    public static void main(String[] args) {
        //depreciation is decreasing value of an asset(property) over the year of its use
        //salvage value : the cost at which it can be sold after its useful life
        //useful life : the time for which the asset can be used
        Scanner in = new Scanner(System.in);
        System.out.print("Enter asset cost (in rupees): ");
        int asset = in.nextInt();
        System.out.print("Enter salvage value (in rupees):");
        int salvage = in.nextInt();
        System.out.print("Enter useful life of asset (in years) :");
        int life = in.nextInt();
        float depre = (float)(asset - salvage)/life;
        System.out.print("Depreciation value of your asset is: "+ depre + " rupees" );

    }
}
