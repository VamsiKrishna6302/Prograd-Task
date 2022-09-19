package com.company;

import java.util.Scanner;

public class GreatestAmongThreeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        byte a=sc.nextByte();
        byte b=sc.nextByte();
        byte c=sc.nextByte();
        byte d=a>(c>b ? c:b) ? a :((c>b)?c:b);
        System.out.println(d);

    }
}
