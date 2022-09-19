package com.company;

import java.util.Scanner;

public class ValidAngles {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("========================================================");
        System.out.print("Enter the angle 1: ");
        byte a1=sc.nextByte();
        System.out.print("Enter the angle 2: ");
        byte a2=sc.nextByte();
        System.out.print("Enter the angle 3: ");
        byte a3=sc.nextByte();
        if(a1 >0 && a2>0 && a3 >0){
            if((a1+a2+a3)==180){
                System.out.println("Valid Triangle");
            }
        }
            else{
            System.out.println("Sorry,Given Angles are not possible to make Triangle");
        }
        System.out.println("========================================================");
    }
}
