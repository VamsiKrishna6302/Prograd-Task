package com.company;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        byte num=sc.nextByte();
        for(int i=1;i<=10;i++){
            System.out.println(num+"x"+i+"="+num*i);
        }
    }
}
