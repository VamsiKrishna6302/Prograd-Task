package com.company;

import java.util.Scanner;

public class MarriagePolicy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("======================================================================================");
        System.out.print("Enter the marital status :");
        String marital=sc.nextLine();
        if (marital.equalsIgnoreCase("Married")){
            System.out.println("Driver is insured");
        }else if(marital.equalsIgnoreCase("unmarried")){
            System.out.print("Enter the gender :");
            String gender=sc.nextLine();
            System.out.print("Enter the age : ");
            byte age=sc.nextByte();
            if(gender.equalsIgnoreCase("Male") && age>30){
                System.out.println("Driver is unmarried  male driver and age above 30 years and he  is insured");
            }else if(gender.equalsIgnoreCase("Female") && age>25){
                System.out.println("Driver is unmarried female age 25 years above and she is insured ");
            }else{
                System.out.println("Sorry to say,Drive is not insured");
            }
        }
        System.out.println("======================================================================================");
    }
}
