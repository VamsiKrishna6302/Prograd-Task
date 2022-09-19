package com.company;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        byte row=sc.nextByte();
        for(int i=row;i>=1;i--){
            for (int j=row;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
