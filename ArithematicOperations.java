package com.company;

import java.util.Scanner;

public class ArithematicOperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("=========================================");
        System.out.print("Enter the number 1: ");
        byte a=sc.nextByte();
        System.out.print("Enter the number 2: ");
        byte b=sc.nextByte();
        //System.out.println("=========================================");
        System.out.println("Addition of two numbers       : "+a+b);
        System.out.println("Subtraction of two numbers    : "+(a-b));
        System.out.println("Division of two numbers       : "+(float)a/b);
        System.out.println("Multiplication of two numbers : "+a*b);
        System.out.println("Remainder of two numbers      : "+(a%b));
        System.out.println("=========================================");
    }
}
