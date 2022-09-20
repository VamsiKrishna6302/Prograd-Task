package com.company;

import java.util.Scanner;

public class SumOfNatural {
    public static int add(int n){
        if(n==0)
            return 0;
        else
            return n+add(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        byte b=sc.nextByte();
        System.out.println("Sum = "+ add(b));
    }
}
