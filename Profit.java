package com.company;

import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("=========================================");
        System.out.print("Enter the Selling price : ");
        short sp=sc.nextShort();
        System.out.print("Enter the Cost price    : ");
        short cp=sc.nextShort();
        System.out.println("Profit gained is      : "+(sp-cp));
        System.out.println("=========================================");
    }
}
