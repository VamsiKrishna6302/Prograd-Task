package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestAndLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length : ");
        byte num=sc.nextByte();
        int[] arr=new int[num];
        System.out.println("Enter the elements : ");
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Ascending order : ");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Minimum is "+arr[0]);
        System.out.println("Maximum is "+arr[num-1]);
        int S_max=arr[num-1];
        for(int i=num-2;i>=0;i--){
            if(arr[num-1]==arr[0]){
                System.out.println("All elements are equal");
            }
           else if(S_max==arr[i]){
                continue;
            }else if(S_max>arr[i]){
                System.out.println("Second largest number is: "+arr[i]);
                break;
            }
        }
    }
}
