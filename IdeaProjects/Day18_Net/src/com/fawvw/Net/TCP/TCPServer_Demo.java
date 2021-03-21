package com.fawvw.Net.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer_Demo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        Socket socket = ss.accept();
        InputStream is = socket.getInputStream();

        byte[] bytes = new byte[1024];
        int read = is.read(bytes);
        String str1 = new String(bytes,0,read);
        System.out.println(str1);
        OutputStream os = socket.getOutputStream();
        os.write("服务器收到啦".getBytes());

        socket.close();
        ss.close();

    }
}
