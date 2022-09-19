package com.company;

import java.util.Scanner;

public class AddMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

        }System.out.println("The  matrix1 is :");
        for(int i = 0; i<row;i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr1[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("How many rows you want ");
        byte row1 = sc.nextByte();

        System.out.println("How many columns you want");
        byte col1 = sc.nextByte();

        int [][]arr2= new int[row1][col1];

        for(int i = 0; i<row1;i++)
        {
            for(int j =0;j<col1;j++)
            {
                System.out.println("Enter a element");
                arr2[i][j]=sc.nextInt();
            }

        }System.out.println("The  matrix2 is :");
        for(int i = 0; i<row1;i++) {
            for (int j = 0; j < col1; j++) {
                System.out.print(arr2[i][j] + "  ");
            }
            System.out.println();
        }
        if(row==row1 && col==col1){
            int[][] add=new int[row][col];
            int[][] sub=new int[row][col];
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    add[i][j]=arr1[i][j]+arr2[i][j];
                }
            }
            System.out.println("Addition of the matrix is : ");
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    System.out.print(add[i][j]+" ");
                }
                System.out.println();
            }
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    sub[i][j]=arr1[i][j]-arr2[i][j];
                }
            }
            System.out.println("Subtraction of the matrix is : ");
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    System.out.print(sub[i][j]+" ");
                }
                System.out.println();
            }
        }else{
            System.out.println("Invalid ");
        }
    }
}
