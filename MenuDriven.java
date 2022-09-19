package com.company;

import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {
        System.out.println("=========================================================================");
        System.out.println("1.Area Of Circle");
        System.out.println("2.Area Of Square");
        System.out.println("3.Area Of Rectangle");
        System.out.println("4.Area Of Triangle");
        System.out.print("Enter the choice :");
        Scanner sc=new Scanner(System.in);
        byte area=sc.nextByte();
        switch(area){
            case 1:
                System.out.print("Enter the radius : ");
                float radius=sc.nextFloat();
                System.out.println("Area of circle is : "+(float)Math.PI*radius*radius);
                System.out.println("=========================================================================");
                break;
            case 2:
                System.out.print("Enter the side : ");
                float side=sc.nextFloat();
                System.out.println("Area of square is : "+side*side);
                System.out.println("=========================================================================");
                break;
            case 3:
                System.out.print("Enter the length : ");
                float length=sc.nextFloat();
                System.out.print("Enter the breadth: ");
                float breadth=sc.nextFloat();
                System.out.println("Area of Rectangle is : "+length*breadth);
                System.out.println("=========================================================================");
                break;
            case 4:
                System.out.print("Enter the height : ");
                float height=sc.nextFloat();
                System.out.print("Enter the breadth : ");
                float breadt=sc.nextFloat();
                System.out.println("Area of Triangle is : "+(0.5f)*height*breadt);
                System.out.println("=========================================================================");
                break;
            default:
                System.out.println("Invalid choice please run again.........");
                System.out.println("=========================================================================");
                break;
        }
    }
}
