package JDBC_HikariCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient_Demo {
    public static void main(String[] args) throws IOException {
       Socket s = new Socket("127.0.0.1",8888);
        OutputStream os = s.getOutputStream();
        os.write("你好啊服务器".getBytes());
        InputStream is = s.getInputStream();

        byte[] bytes = new byte[1024];
        int read = is.read(bytes);
        System.out.println();
        String str2 = new String(bytes,0,read);
        System.out.println(str2);
        s.close();
    }
}
