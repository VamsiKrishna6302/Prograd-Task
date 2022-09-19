package com.company;

import java.util.Scanner;

public class AreaAndPerimeter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius : ");
        byte r=sc.nextByte();
        double p=2*Math.PI*r;
        System.out.println("Perimeter of circle is : "+p);
        double area=Math.PI*r*r;
        System.out.println("Area of circle is : "+area);
    }
}
