package com.company;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        byte row=sc.nextByte();
        for(int i=1;i<=row;i++){
            for(int j=row-i;j>=1;j--){
                System.out.print(" ");
            }for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
