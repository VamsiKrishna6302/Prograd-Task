package com.company;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        if(num>0){
            for(int i=2;i<num;i++){
                while(num%i==0){
                    System.out.println(i+" ");
                    num=num/i;
                }
            }if(num>2){
                System.out.println(num);
           }
        }
    }
}
