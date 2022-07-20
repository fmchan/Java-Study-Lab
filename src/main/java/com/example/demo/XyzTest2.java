package com.example.demo;

import java.util.*;

public class XyzTest2 {

    static int index = 0;

    public static void main(String[] args) {
        String[] args2 = {"ADD", "SUBTRACT"};
        List<MathOperation> myList = Arrays.asList(new MathOperation(), new MathOperation());
        myList.forEach(m -> System.out.print(m.calculate(args2[index ++], 1, 2) + " "));
    }
}

class MathOperation {
    public int calculate(String choice, int a, int b) {
        int c = 3;
        switch (choice) {
            case "ADD":
                c += a + b;
            case "SUBTRACT":
                c += a - b;
            default:
                c += a * b;
        }
        return c;
    }
}