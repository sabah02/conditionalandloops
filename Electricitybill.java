package com.company;

import java.util.Scanner;

public class Electricitybill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Energy used by an appliance (W) : ");
        int W = in.nextInt();
        System.out.print("Enter # of hours energy is used by an appliance(hr): ");
        int T = in.nextInt();
        float Wh = W*T;
        System.out.println("Watt-hour : "+ Wh);
        float KWh = Wh/1000f;
        System.out.println("KWh: "+KWh);
        System.out.print("Enter price of 1 unit : ");
        float unit = in.nextFloat();
        float perday = KWh*unit;
        System.out.println("Cost of electricity consumed by an appliance perday :  "+ perday+" rupees");
        float monthly = perday*30f;
        System.out.println("Cost of electricity consumed by an appliance monthly: "+ monthly+" rupees");
    }
}
