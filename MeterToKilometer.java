package com.company;

import java.util.Scanner;

public class MeterToKilometer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("=========================================");
        System.out.print("Enter the meters: ");
        short meter=sc.nextShort();
        System.out.println("kilometers : "+(float)meter/1000+" kms ");
        System.out.println("=========================================");

    }
}
