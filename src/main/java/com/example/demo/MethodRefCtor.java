package com.example.demo;

import java.util.*;
import java.util.function.*;
//public class Sandbox {}
class MethodRefCtor
{
     static void populate(Supplier<List> s, String... stuff) {
        List l = s.get();
        for (int i=0; i<stuff.length;++i) l.add(stuff[i]);
        System.out.println(l);
     }

    public static void main(String[] args) {
        MethodRefCtor mrc = new MethodRefCtor();
        populate(ArrayList::new,"Red","Green","Blue");
    }
}