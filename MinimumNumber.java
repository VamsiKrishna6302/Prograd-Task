package com.company;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("===================================");
        System.out.println("Enter the number1 : ");
        byte n1=sc.nextByte();
        System.out.println("Enter the number2 : ");
        byte n2=sc.nextByte();
        byte n3=(n1>n2)?n2:n1;
        System.out.println("Minimum number is "+n3);
        System.out.println("===================================");
    }
}
