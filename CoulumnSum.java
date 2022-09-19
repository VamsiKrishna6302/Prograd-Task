package com.company;

import java.util.Scanner;

public class CoulumnSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows : ");
        byte row=sc.nextByte();
        int[][] arr=new int[row][];
        for(int i=0;i<row;i++){
            System.out.println("Enter tye columns for "+i+1+" row ");
            byte col=sc.nextByte();
            arr[i]=new int[col];
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println("Enter the element: ");
                arr[i][j]=sc.nextByte();
            }
        }for(int i=0;i<row;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }int[][] arr1=new int[3][3];
        //System.out.println("Transpose of the matrix is : ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr1[i][j]=arr[j][i];
            }
     }for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr1[i][j]+" ");
            }
          System.out.println();
        }for(int i=0;i<3;i++) {
            int k=0;
            for (int j = 0; j < 3; j++) {
                k+=arr1[i][j];
            }
            System.out.println("Sum of "+i+" column is : "+k);
        }
    }
}
