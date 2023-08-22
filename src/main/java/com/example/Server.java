package com.example;

import com.alibaba.druid.support.json.JSONUtils;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket= new ServerSocket(8090)){
            Socket socket =  serverSocket.accept();
            System.out.println("IP地址为：" + socket.getInetAddress().getHostAddress());
            InputStream stream = socket.getInputStream();
            FileOutputStream fileOutputStream = new FileOutputStream("file/Test.txt");
            byte[] bytes = new byte[1024];
            int i;
            System.out.println(stream.toString());
            while ((i = stream.read(bytes)) != -1){
                fileOutputStream.write(bytes, 0, i);
//                System.out.println("11111");
//                System.out.println(stream.read(bytes));
            }

            fileOutputStream.flush();
            fileOutputStream.close();
            socket.close();

        }catch (IOException e){
            e.printStackTrace();
        }
//        try (ServerSocket serverSocket = new ServerSocket(8080)) {
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}