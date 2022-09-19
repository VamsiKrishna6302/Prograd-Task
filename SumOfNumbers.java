package com.company;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        Integer num=sc.nextInt();
        int sum=0;
        int num1=num%10;
        int n=(int)num/10;
        sum+=num1;
        int num2=n%10;
        int n1=(int)n/10;
        sum+=num2;
        int num3=n1%10;
        sum+=num3;
        System.out.println("The sum of the numbers are : "+sum);
    }
}
