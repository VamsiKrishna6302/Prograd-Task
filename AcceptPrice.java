package com.company;

import java.util.Scanner;

public class AcceptPrice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("========================================================");
        System.out.print("Enter the cost of each item : ");
        byte rateOfEachItem=sc.nextByte();
        System.out.print("Enter the quantity of item : ");
        short quantity= sc.nextShort();
        if(quantity>=10){
            float total=rateOfEachItem*quantity;
            float dis=total/10;
            System.out.println("After the discount accept price is : "+(total-dis));
        }else{
            System.out.println("Total cost without discount is : "+(float)(rateOfEachItem*quantity));
        }
        System.out.println("========================================================");
    }
}
