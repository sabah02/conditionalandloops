package com.company;

import java.util.Scanner;

public class nCRnPR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n and r value: ");
        int n = in.nextInt();
        int r = in.nextInt();
        int nfact = 1;
        int nrfact = 1;
        int rfact = 1;
        for(int i =  n ; i>1; i--)
        {
            nfact*=i;
        }
        System.out.println(nfact);
        int x = n-r;
        for(int j = x ; j >1; j--)
        {
            nrfact*=j;
        }
        System.out.println(nrfact);
        float nPR = (float)nfact/nrfact;
        System.out.println("nPR = " + nPR);

        for(int k = r ; k>1 ; k--)
        {
            rfact*=k;
        }
        System.out.println(rfact);
        float nCR = (float)nfact/(rfact*nrfact);
        System.out.print("nCR = :"+ nCR);
    }

}
