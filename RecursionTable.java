package com.company;

import java.util.Scanner;

public class RecursionTable {
    static int i=1;
    public static Object Table(int n){
        if(i<=9) {
            System.out.println(n +"X"+i+"="+n*i);
            i++;
            Table(n);
        }
        return n +"X"+i+"="+n*i;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        byte b=sc.nextByte();
        System.out.println(Table(b));
    }
}
