package com.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) {
        try(Socket socket = new Socket("localhost",8090)) {
            FileInputStream fileInputStream = new FileInputStream("test.txt");
            OutputStream stream = socket.getOutputStream();
            byte[] bytes = new byte[1024];
            int i;
            while ((i = fileInputStream.read()) != -1){
                stream.write(bytes, 0, i);
//                System.out.println("22222");
//                System.out.println(fileInputStream.read());
            }

            stream.flush();
            fileInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
