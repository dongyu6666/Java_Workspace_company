package jdbc.datasource.template;

import org.springframework.jdbc.core.JdbcTemplate;
import util.JDBCUtils_new;

/**
 * JdbcTemplate入门
 */
public class JDBCTemplate1 {
    public static void main(String[] args) {
        //1.导入jar包
        //2.创建JDBCTemplate对象
        JdbcTemplate template = new JdbcTemplate(JDBCUtils_new.getDataSource());
        //3.调用方法
        String sql = "update `test`.`account` set balance = 5000 where id = 1";
        int result = template.update(sql);
        System.out.println(result);

    }
}
