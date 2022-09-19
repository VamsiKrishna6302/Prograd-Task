package com.company;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("========================================================");
        System.out.print("Enter the salary : ");
        int sal=sc.nextInt();
        float TA=sal*(0.1F);
        float DA=sal*(0.15F);
        float HRA=sal*(0.2F);
        float Pf=sal*(0.12F);
        if(sal>=20000){
            float bonus=sal*(0.1f);
            System.out.println("Gross Salary  with  10 % bonus : "+(sal+DA+TA+HRA+bonus-Pf));
        }else{
            float bonus=sal*(0.2f);
            System.out.println("Gross Salary with 20 % bonus : "+(sal+DA+TA+HRA+bonus-Pf));
        }
        System.out.println("========================================================");
    }
}
