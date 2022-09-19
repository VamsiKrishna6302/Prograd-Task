package com.company;
import java.util.*;
public class VectorOperations {
    public static void main(String[] args) {
        Vector v=new Vector ();
        v.add(1);
        v.add("V");
        v.add(13.2f);
        v.remove(1);
        System.out.println(v.size());
        System.out.println(v.capacity());
        for(Object i:v){
            System.out.println(i);
        }
        System.out.println();

    }

}
