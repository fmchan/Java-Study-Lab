package com.example.demo;

public class DetermineBlankCh{
    public static void main(String ... args){
        String characters = " a b a ";    
        String newCharacters = characters.strip().repeat(4);
        String splitCharacters [] = newCharacters.split("[ab]");
        int blank = 0;
        for(String t : splitCharacters){
            if(t.isBlank()){
                blank ++;
            }
        }
        System.out.println(blank);
    }
}