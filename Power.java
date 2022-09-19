package com.company;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base : ");
        byte base=sc.nextByte();
        System.out.println("Enter the power : ");
        byte pow=sc.nextByte();
        int num=1;
        for(int i=0;i<pow;i++){
            num=num*base;
        }
        System.out.println(num);

    }
}
