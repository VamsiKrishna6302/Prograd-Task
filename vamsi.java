package com.company;

import java.util.*;

public class vamsi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the marks 1 : ");
        byte maths=sc.nextByte();
        System.out.print("Enter the marks 2 : ");
        byte java=sc.nextByte();
        System.out.print("Enter the marks 3 : ");
        byte c=sc.nextByte();
        if(maths<=100 && java<=100 && c<=100){
            double f=(double)(maths+java+c)/3;
            System.out.println("Average is: "+f);
        }
    }
}
