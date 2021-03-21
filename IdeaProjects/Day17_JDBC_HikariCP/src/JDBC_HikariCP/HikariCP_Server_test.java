package JDBC_HikariCP;

import JDBCUtils_HikariCP.JDBCUtils;
import domain.TestLei;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class HikariCP_Server_test {
    public static void main(String[] args) throws IOException {
        TestLei testLei = new TestLei();
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());

        ServerSocket ss = new ServerSocket(8888);
        Socket socket = ss.accept();
        InputStream is = socket.getInputStream();

        byte[] bytes = new byte[1024];
        int read = is.read(bytes);
        String str = new String(bytes,0,read);
        System.out.println(str);

/*
        查询 .query
*/
        String sql = "SELECT id, user_name FROM USER";

        OutputStream os = socket.getOutputStream();

        List<TestLei> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<TestLei>(TestLei.class));
        String result = list.toString();

        os.write(result.getBytes());

        socket.close();
        ss.close();
    }

}
