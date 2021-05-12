package jdbc.datasource.template;

import domain.Account;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import util.JDBCUtils_new;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/*Template练习*/
/*			* 需求：
				1. 修改1号数据的 balance 为 10000
				2. 添加一条记录
				3. 删除刚才添加的记录
				4. 查询id为1的记录，将其封装为Map集合
				5. 查询所有记录，将其封装为List
				6. 查询所有记录，将其封装为accout对象的List集合
				7. 查询总记录数*/
public class JDBCTemplate2 {
    public static <account> void main(String[] args) {
        //1. 修改1号数据的 balance 为 10000
/*        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils_new.getDataSource());
        String sql1 = "update `test`.`account` set balance = 10000 where id = ?";
        int result1 = jdbcTemplate.update(sql1, 1);
        System.out.println(result1);*/

        //2. 添加一条记录

        /*JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils_new.getDataSource());
        String sql2 = "INSERT INTO `test`.`account` (`id`, `name`, `balance`) VALUES ('6', 'Somebody', '100');";
        int result2 = jdbcTemplate.update(sql2);
        System.out.println(result2);*/
        //3. 删除刚才添加的记录
        /*JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils_new.getDataSource());
        String sql3 = "delete from `test`.`account` where id = ?;";
        int result3 = jdbcTemplate.update(sql3,6);
        System.out.println(result3);*/


        //4. 查询id为1的记录，将其封装为Map集合
        //* 注意：这个方法查询的结果集长度只能是1
        /*JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils_new.getDataSource());
        String sql4 = "select * from `test`.`account` where id = ? ;";
        Map<String, Object> stringObjectMap = jdbcTemplate.queryForMap(sql4, 1);
        System.out.println(stringObjectMap);*/


        //5. 查询所有记录，将其封装为List
        /*JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils_new.getDataSource());
        String sql5 = "select * from `test`.`account`;";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql5);
        for (Map<String, Object> stringObjectMap : list) {
            System.out.println(stringObjectMap);
            
        }*/

        //6. 查询所有记录，将其封装为accout对象的List集合
        //*BeanPropertyRowMapper非常重要

        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils_new.getDataSource());
        String sql6 = "select * from `test`.`account`;";
        List<Account> list = jdbcTemplate.query(sql6, new BeanPropertyRowMapper<Account>(Account.class));
        for (Account account : list) {
            System.out.println(account);
        }

        //7. 查询总记录数
        /*JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils_new.getDataSource());
        String sql7 = "select count(id) from `test`.`account`;";

        Long total = jdbcTemplate.queryForObject(sql7, long.class);
        System.out.println(total);*/


    }


}
