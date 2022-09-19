package com.company;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int num1=num;
        double sum=0;
        String k=String.valueOf(num);
        int len=k.length();
        while(num>0){
            int q=num%10;
            sum=sum+Math.pow(q,len);
            num=num/10;
        }
        //System.out.println(sum);
        if(sum==num1){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not an armstrong");
        }
    }
}
