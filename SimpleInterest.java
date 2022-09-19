package com.company;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("=========================================");
        System.out.print("Enter the principal amount: ");
        int PA=sc.nextInt();
        System.out.print("Enter the number of years : ");
        byte years=sc.nextByte();
        float rate_of_interest=7.5f;
        float SI=(PA*years*rate_of_interest)/100;
        System.out.println("Simple interest is: "+SI);
        System.out.println("=========================================");
    }
}
