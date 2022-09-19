package com.company;

import java.util.Scanner;

public class ZaggedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the rows : ");
        byte row=sc.nextByte();
        int[][] arr=new int[row][];
        for(int i=0;i<row;i++){
            System.out.print("Enter the elements of " + (i+1)+" column :");
            byte col=sc.nextByte();
            arr[i]=new int[col];
        }for(int i=0;i<row;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print("Enter the element : ");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix is: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("");
        for(int i=0;i<row;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
            System.out.println("Row "+ (i+1) +" sum is : "+sum);
        }

    }
}
