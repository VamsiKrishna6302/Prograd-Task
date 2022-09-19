package com.company;

import java.util.Scanner;

public class SquareAndCube {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("=========================================");
        System.out.print("Enter the number : ");
        byte num=sc.nextByte();
        System.out.println("Square is : "+num*num);
        System.out.println("Cube is   : "+(int)Math.pow(num,3));
        System.out.println("=========================================");
    }
}
