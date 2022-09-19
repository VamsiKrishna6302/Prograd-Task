package com.company;

import java.util.*;
import java.lang.*;

public class CharOrDigit {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("===================================");
        System.out.print("Enter the character :");
        char ch=sc.nextLine().charAt(0);
        if(Character.isAlphabetic(ch))
        {
            System.out.println("Alphabet");
        }else if(Character.isDigit(ch)){
            System.out.println("Digit");
        }
        System.out.println("===================================");
    }
}
