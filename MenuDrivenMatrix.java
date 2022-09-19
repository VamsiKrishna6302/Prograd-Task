package com.company;

import java.util.Scanner;

public class MenuDrivenMatrix {
    public static void main(String[] args) {
        boolean vamsi=true;
       while(vamsi){
           System.out.println("1.Addition");
           System.out.println("2.Subtraction");
           System.out.println("3.Transposing");
           System.out.println("4.Exit");
           System.out.print("Enter you choice : ");
           Scanner sc=new Scanner(System.in);
           byte choice=sc.nextByte();
           switch(choice){
               case 1:
                   //Scanner sc = new Scanner(System.in);
                   System.out.print("How many rows you want for matrix 1: ");
                   byte row = sc.nextByte();
                   System.out.print("How many columns you want for matrix 1 : ");
                   byte col = sc.nextByte();
                   int [][]arr1= new int[row][col];
                   System.out.print("How many rows you want for matrix 2 : ");
                   byte row1 = sc.nextByte();
                   System.out.print("How many columns you want for matrix 2 : ");
                   byte col1 = sc.nextByte();
                   int [][]arr2= new int[row1][col1];
                   if(row==row1 && col==col1){
                       for(int i = 0; i<row;i++)
                       {
                           for(int j =0;j<col;j++)
                           {
                               System.out.print("Enter a element");
                               arr1[i][j]=sc.nextInt();
                           }
                       }System.out.println("The  matrix 1 is :");
                       for(int i = 0; i<row;i++) {
                           for (int j = 0; j < col; j++) {
                               System.out.print(arr1[i][j] + "  ");
                           }
                           System.out.println();
                       }
                       System.out.println("Enter the matrix 2 elements : ");
                       for(int i = 0; i<row1;i++)
                       {
                           for(int j =0;j<col1;j++)
                           {
                               System.out.print("Enter a element : ");
                               arr2[i][j]=sc.nextInt();
                           }
                       }System.out.println("The  matrix 2 is :");
                       for(int i = 0; i<row1;i++) {
                           for (int j = 0; j < col1; j++) {
                               System.out.print(arr2[i][j] + "  ");
                           }
                           System.out.println();
                       }
                       System.out.println("Addition of the matrix is : ");
                       int[][] add=new int[row][col];
                       for(int i=0;i<row;i++){
                           for(int j=0;j<col;j++){
                               add[i][j]=arr1[i][j]+arr2[i][j];
                           }
                       }
                       for(int i=0;i<row;i++){
                           for(int j=0;j<col;j++){
                               System.out.print(add[i][j]+" ");
                           }
                           System.out.println();
                       }
                   }else{
                       System.out.println("Not possible to do operation ");
                   }break;
               case 2:
                   System.out.print("How many rows you want for matrix 1 : ");
                   byte r = sc.nextByte();
                   System.out.print("How many columns you want for matrix 1 : ");
                   byte c = sc.nextByte();
                   int [][]arr3= new int[r][c];
                   System.out.print("How many rows you want for matrix 2 : ");
                   byte r1 = sc.nextByte();
                   System.out.print("How many columns you want for matrix 2 : ");
                   byte c1 = sc.nextByte();
                   int [][]arr4= new int[r1][c1];
                   if(r==r1 && c==c1){
                       for(int i = 0; i<r;i++)
                       {
                           for(int j =0;j<c;j++)
                           {
                               System.out.print("Enter a element : ");
                               arr3[i][j]=sc.nextInt();
                           }
                       }System.out.println("The  matrix 1 is :");
                       for(int i = 0; i<r;i++) {
                           for (int j = 0; j < c; j++) {
                               System.out.print(arr3[i][j] + "  ");
                           }
                           System.out.println();
                       }
                       System.out.println("Enter the elements for matrix 2: ");
                       for(int i = 0; i<r1;i++)
                       {
                           for(int j =0;j<c1;j++)
                           {
                               System.out.print("Enter a element : ");
                               arr4[i][j]=sc.nextInt();
                           }
                       }System.out.println("The  matrix 2 is :");
                       for(int i = 0; i<r1;i++) {
                           for (int j = 0; j < c1; j++) {
                               System.out.print(arr4[i][j] + "  ");
                           }
                           System.out.println();
                       }System.out.println("Subtraction of the matrix is : ");
                       int[][] sub=new int[r][c];
                       for(int i=0;i<r;i++){
                           for(int j=0;j<c;j++){
                               sub[i][j]=arr3[i][j]-arr4[i][j];
                           }
                       }
                       for(int i=0;i<r;i++){
                           for(int j=0;j<c;j++){
                               System.out.print(sub[i][j]+" ");
                           }
                           System.out.println();
                       }

                   }
                   else{
                   System.out.println("Not possible to do operation ");
               }break;
               case 3:
                   System.out.print("How many rows you want: ");
                   byte r2 = sc.nextByte();
                   System.out.print("How many columns you want: ");
                   byte c2 = sc.nextByte();
                   int [][]ar1= new int[r2][c2];

                   for(int i = 0; i<r2;i++)
                   {
                       for(int j =0;j<c2;j++)
                       {
                           System.out.print("Enter a element: ");
                           ar1[i][j]=sc.nextInt();
                       }
                   }
                   System.out.println("Original Matrix : ");
                   for(int i = 0; i<r2;i++) {
                       for (int j = 0; j < c2; j++) {
                           System.out.print(ar1[i][j]+" ");
                       }
                       System.out.println();
                   }
                   int[][] ar2=new int[c2][r2];
                   for(int i=0;i<c2;i++){
                       for(int j=0;j<r2;j++){
                           ar2[i][j]=ar1[j][i];
                       }
                   }
                   System.out.println("Transposed matrix is : ");
                   for(int i = 0; i<c2;i++) {
                       for (int j = 0; j < r2; j++) {
                           System.out.print(ar2[i][j]+" ");
                       }
                       System.out.println();
                   }break;
               default:
                   vamsi=false;
                   System.out.println("Exiting the loop");
           }
       }
    }
}
