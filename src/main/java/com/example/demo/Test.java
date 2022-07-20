package com.example.demo;

public class  Test{
    public static void main (String[] args) {
         Integer x = 3, y = x;
         try {
              System.out.println(Integer.compareUnsigned(x, 3) == 0 || Integer.compareUnsigned(y, 0) == 0);
         }
         catch (Exception ex) {
              System.out.println(ex.getClass().toString());    
         }
         y = ~x;
         try {
              System.out.println(y.compareTo(3) == 0 || false);
         }
         catch (Exception ex) {
              System.out.println(ex.getClass().toString());    
         }
    }
} 