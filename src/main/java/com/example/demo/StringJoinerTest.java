package com.example.demo;

import java.util.StringJoiner;
public class StringJoinerTest implements I2 {
    public static void main(String[] args) {
        StringJoiner sj1 = new StringJoiner(":", "[", "]");
        sj1.add("red").add("green").add("blue");

        StringJoiner sj2 = new StringJoiner("/", "{", "}");
        sj2.add("yellow").add("violet").add("orange");
        
        sj2.merge(sj1);
        System.out.println(sj2.toString());

        Runtime.getRuntime().totalMemory();
        Runtime.getRuntime().maxMemory();
        Runtime.getRuntime().freeMemory();

        System.out.print(I2.name+",");     
        System.out.print(I2.s1+",");    
        System.out.print(((I1)new StringJoinerTest()).name);  
    }
}

interface I1 {
   String name = "N1";
    String s1 = "S1";
     }
     interface I2 extends I1{
       String name = "N2";
     }
