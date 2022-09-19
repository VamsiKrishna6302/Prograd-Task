package com.company;

import java.util.Scanner;

public class MenuDriven2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("=========================================================================");
        System.out.println("1.given number is even or odd ");
        System.out.println("2. given number is positive or negative ");
        System.out.println("3. find maximum between given two numbers ");
        System.out.println("4. convert days into months and remaining days");
        System.out.print("Enter your choice : ");
        byte choice=sc.nextByte();
        switch(choice){
            case 1:
                System.out.print("Enter the number: ");
                int num=sc.nextInt();
                if(num%2==0){
                    System.out.println("Even Number");
                }else if(num%2!=0){
                    System.out.println("Odd Number");
                }else{
                    System.out.println("It is a zero ");
                }
                System.out.println("=========================================================================");
                break;
            case 2:
                System.out.print("Enter the number: ");
                int n1=sc.nextInt();
                if(n1>0){
                    System.out.println("Positive number");
                }else if(n1<0){
                    System.out.println("Negative number ");
                }else{
                    System.out.println("Its not a neither positive nor negative");
                }
                System.out.println("=========================================================================");
                break;
            case 3:
                System.out.print("Enter the number 1: ");
                int p=sc.nextInt();
                System.out.print("Enter the number 2: ");
                int q=sc.nextInt();
                if(p>q){
                    System.out.println("Maximum is "+p);
                }else if(q>p){
                    System.out.println("Maximum is: "+q);
                }else{
                    System.out.println("Both are equal");
                } System.out.println("=========================================================================");
                break;
            case 4:
                System.out.print("Enter the number of days : ");
                int days=sc.nextInt();
                System.out.println(days/30+" Months and "+days%30+" days ");
                System.out.println("=========================================================================");
                break;
            default:
                System.out.println("Invalid choice :");
                System.out.println("=========================================================================");
                break;
        }

    }
}
