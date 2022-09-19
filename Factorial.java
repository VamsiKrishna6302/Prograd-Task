package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        byte num=sc.nextByte();
        int fac=1;
        for(int i=num;i>=1;i--){
            fac=fac*i;
        }
        System.out.println("Factorial is : "+fac);

    }
}
