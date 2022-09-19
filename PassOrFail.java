package com.company;

import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("===================================");
        System.out.print("Enter the percentage : ");
        byte p=sc.nextByte();
        String per=(p>=40)?"pass":"fail";
        System.out.println(per);
        System.out.println("===================================");

    }
}
