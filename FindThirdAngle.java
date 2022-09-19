package com.company;

import java.util.Scanner;

public class FindThirdAngle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("=========================================");
        System.out.print("Enter the angle 1: ");
        byte a1=sc.nextByte();
        System.out.print("Enter the angle 2: ");
        byte a2=sc.nextByte();
        System.out.println("Third angle is  : "+(180-(a1+a2)));
        System.out.println("=========================================");

    }
}
