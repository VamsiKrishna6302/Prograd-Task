package com.company;

import java.util.Scanner;

public class RecursivePower {
    public static int power(int a,int b){
        if(b>=1){
            return a*power(a,--b);
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base : ");
        byte a=sc.nextByte();
        System.out.println("Enter the power : ");
        byte b=sc.nextByte();
        System.out.println(" Result is = "+power(a,b));

    }
}
