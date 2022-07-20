package com.example.demo;

public class XyzTest {
    
    private int firstNumber;
    private int secondNumber;
    public XyzTest(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = -- secondNumber;
    }
    public void display() {
        class Sum {
            public void sum () {
                secondNumber = firstNumber +++ secondNumber;
            }
            
        }
        Sum d = new Sum();
        d.sum();
        System.out.println("firstNumber = " + firstNumber + ", secondNumber=" + secondNumber);
    }

    public static void main (String [] args) {
        XyzTest t = new XyzTest(1, 2);
        t.display();     
        System.out.println("firstNumber = " + t.firstNumber);
        System.out.println("secondNumber = " + t.secondNumber);
    }
}