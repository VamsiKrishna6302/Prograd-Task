package com.company;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        byte temp,n1,n2;
        System.out.print("Enter the n1: ");
        n1=sc.nextByte();
        System.out.print("Enter the n2: ");
        n2=sc.nextByte();
        temp=n1;
        n1=n2;
        n2=temp;
        System.out.println("After swapping: ");
        System.out.println("value of n1 : "+n1);
        System.out.println("value of n2 : "+n2);
    }
}
