package com.company;

import java.util.Scanner;

public class EvenSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        short num=sc.nextShort();
        int sum=0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        System.out.println("Sum of even numbers is "+sum);

    }
}
