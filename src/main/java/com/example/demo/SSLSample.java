package com.example.demo;

import java.io.*;
import javax.net.ssl.*;

public class SSLSample {

    private final static String IP = "1.1.0.1";
    private final static int PORT = 443;

    public static void main(String... args) throws IOException {
        SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();
        try (SSLSocket socket = (SSLSocket) factory.createSocket(IP, PORT);
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));) {
            System.out.append(br.readLine());
        } catch (IOException e) {
        }
    }
}