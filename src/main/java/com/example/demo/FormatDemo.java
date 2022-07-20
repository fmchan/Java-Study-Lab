package com.example.demo;

import java.text.*;
public class FormatDemo {
    public static void main(String[] args) {
        try {
            double[] limits = { 1, 2, 3 };
            String[] strArray = { "{2}", "{2}", "{2}" };
            ChoiceFormat choiceFormat = new ChoiceFormat(limits, strArray);
            Format[] formatArray = { choiceFormat, null, NumberFormat.getInstance() };
            MessageFormat messageFormat = new MessageFormat("{0} out of {2}");
            messageFormat.setFormats(formatArray);
            Object[] testArgs = { null, "3", null };
            for (int i = 0; i < 4; ++i) {
                testArgs[0] = i;
                testArgs[2] = testArgs[0];
                System.out.println(messageFormat.format(testArgs));
            }
        } catch (Exception e) {
            System.out.println(e.getClass());
        }

        @FunctionalInterface
interface MyFunction<T, U, W>{
    
    public W myFunction(T a, T b, U c);
}
MyFunction <String, Integer, String> f  = (var a, var b, var c)-> a + b + c;
f.myFunction("a", "b",Integer.SIZE);

    }


}