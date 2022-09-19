package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class CountOfCharacter {
    public static void main(String[] args) {
        HashMap<Character,Integer> value=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        for(int i=0;i<name.length();i++){
            value.put(name.charAt(i),value.getOrDefault(name.charAt(i),0)+1);
        }
        System.out.println(value);
    }
}
