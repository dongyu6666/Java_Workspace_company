package JDBC_HikariCP;

import JDBCUtils_HikariCP.JDBCUtils;
import domain.myselfLei;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Map;

public class HikariCP_Test {
    public static void main(String[] args) {
        myselfLei myselfLei = new myselfLei();
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());
        /*
        * JdbcTemplate主要提供以下三种类型的方法
        executeXxx() : 执行任何SQL语句，对数据库、表进行新建、修改、删除操作
        updateXxx() : 执行新增、修改、删除等语句
        queryXxx() : 执行查询相关的语句
        * */

        /*查询 .query*/
        /*String sql = "SELECT user_name FROM USER";
        List<TestLei> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<TestLei>(TestLei.class));
        for (TestLei lei : list) {
            System.out.println(lei);
        }*/


        /*插入 .update*/
        /*String sql = "INSERT INTO `test`.`user` (`id`, `user_name`, `password`, `email`, `phone`) VALUES ('11', 'lalala', '123123123','fawvw1234','13000000000');";
        int update = jdbcTemplate.update(sql);*/

        /*更改 .update*/
        /*String sql = "UPDATE `test`.`user` SET PASSWORD = \"asdfasf\" WHERE id = 7";
        int update = jdbcTemplate.update(sql);
        System.out.println(update);
        if(update == 1){
            System.out.println("更改成功");
        }else{
            System.out.println("更改失败");
        }*/

        /*删除 .update*/
        /*String sql = "DELETE FROM `test`.`user` WHERE id = ?;";
        int update = jdbcTemplate.update(sql,8);
        System.out.println(update);
        if(update == 1){
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }*/

        String sql4 = "select * from `test`.`user` where id = ? ;";
        Map<String, Object> stringObjectMap = jdbcTemplate.queryForMap(sql4, 1);
        System.out.println(stringObjectMap);


    }
}