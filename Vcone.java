package com.company;

import java.util.Scanner;

public class Vcone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //**********volume of cone************
//        System.out.println("Enter radius, height of cone: ");
//        int r =in.nextInt();
//        int h = in.nextInt();
//        float Vcone = (3.14f * r * r * h )/3;
//        System.out.println("Volume of cone is: " + Vcone);

        //************volume of prism*************
//          System.out.println("Enter a , b , h of prism: ");
//          int a = in.nextInt();
//          int b = in.nextInt();
//          int h = in.nextInt();
//          float Vprism = (float)(a*b*h)/2;
//          System.out.println("Volume : "+ Vprism);

        //***********volume of cylinder********
//        System.out.print("Enter radius and height of cylinder: ");
//        int r = in.nextInt();
//        int h = in.nextInt();
//        float Vcylinder = (float)3.14 * r *r*h;
//        System.out.println("Volume of cylinder is: "+ Vcylinder);

        //***********volume of sphere***********
//        System.out.println("Enter radius of sphere: ");
//        int r = in.nextInt();
//        float Vsphere = (float)(4 * 3.14 * r*r*r)/3;
//        System.out.println("Volume of sphere is: "+ Vsphere);

        //**********volume of pyramid***********
//         System.out.print("Enter lenght of base:");
//         int l = in.nextInt();
//         System.out.print("Enter widht of base: ");
//         int w = in.nextInt();
//         System.out.print("Enter height of pyramid: ");
//         int h = in.nextInt();
//         float Vpyramid = (float)(l*w*h)/3;
//        System.out.print("Volume of pyramid is: "+ Vpyramid);

          //*************CSA of cylinder***********
//        System.out.print("Enter radius and height of cylinder: ");
//        int r = in.nextInt();
//        int h = in.nextInt();
//        float CSA = (float)2 * (float)3.14 * r * h;
//        System.out.print("CSA of cylinder: "+CSA);

        //**************TSA of cube*************
        System.out.print("Enter side of cube: ");
        int a = in.nextInt();
        int TSA = 6*a*a;
        System.out.print("TSA of cube is: "+TSA);
    }
}
