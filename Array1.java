package com.company;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length : ");
        byte num=sc.nextByte();
        int[] arr=new int[num];
        int a=sc.nextByte();
        for(int i=1;i<num;i++){
            arr[i]=sc.nextInt();
        }
        for(int k:arr){
            System.out.println(k+5);
        }
    }
}
