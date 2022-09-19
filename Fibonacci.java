package com.company;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        int num1=0;
        int num2=1;
        int temp;
        for(int i=0;i<num;i++){
            temp=num1;
            System.out.println(num1);
            num1=num2;
            num2=num2+temp;
        }
    }
}
