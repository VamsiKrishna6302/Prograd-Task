package com.company;

import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String s=String.valueOf(num);
        String s1="";
        for(int i=s.length()-1;i>=0;i--){
            s1+=s.charAt(i);
        }
        System.out.println(s1);

    }
}
