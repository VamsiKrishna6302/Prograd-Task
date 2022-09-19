package com.company;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        boolean prime=true;
        for(int i=2;i<num/2;i++){
            if(num%i==0){
                prime=false;
                break;
            }
        }if(prime){
            System.out.println("Prime number");
        }else{
            System.out.println("Not a prime number");
        }
    }
}
