package com.fawvw.Net.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient_Guxuan {
    public static void main(String[] args) throws IOException {
       Socket s = new Socket("10.236.99.159",4000);
        OutputStream os = s.getOutputStream();
        os.write("我收到了帅哥".getBytes());
        InputStream is = s.getInputStream();

        byte[] bytes = new byte[1024];
        int read = is.read(bytes);
        System.out.println();
        String str2 = new String(bytes,0,read);
        System.out.println(str2);
        s.close();
    }
}
