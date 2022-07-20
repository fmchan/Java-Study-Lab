package com.example.demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.ExecutionException;
import javax.swing.SwingWorker;

public class NumberLines {
    private static long numberLines = 0;
    public static void main(String[] args) throws InterruptedException {
        
        var worker = new SwingWorker<Long, Void>() {
            @Override
            public Long doInBackground()  {
                System.out.println("execute in background");
                try {
                    return Files.lines(Paths.get("Text.txt")).count();
                } catch (IOException ex) {
                   
                }
                return 0L;
            }

            @Override
            public void done() {
                try {
                numberLines = get();
                } catch (ExecutionException | InterruptedException ex) {}
            }
        };
        worker.execute();            
        worker.done();
        System.out.println("Number lines=" + numberLines);
    }
}