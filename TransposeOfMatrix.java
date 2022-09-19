package com.company;

import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in) ;
        System.out.println("How many rows you want ");
        byte row = sc.nextByte();
        System.out.println("How many columns you want");
        byte col = sc.nextByte();
        int [][]arr1= new int[row][col];

        for(int i = 0; i<row;i++)
        {
            for(int j =0;j<col;j++)
            {
                System.out.println("Enter a element");
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original Matrix : ");
        for(int i = 0; i<row;i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        int[][] arr2=new int[col][row];
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                arr2[i][j]=arr1[j][i];
            }
        }
        System.out.println("Transposed matrix is : ");
        for(int i = 0; i<col;i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
