package com.company;

import java.util.Scanner;

public class SquareandcubeOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length : ");
        byte num=sc.nextByte();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Squares are : ");
        for(int i:arr){
            System.out.print(i*i+" ");
        }
        System.out.println();
        System.out.println("Cubes are ");
        for(int i:arr){
            System.out.print(i*i*i+" ");
        }
    }
}
