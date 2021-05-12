package dao;

import JDBCUtils.JDBCUtils;
import domain.UserLei;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/*
* 操作数据库中User表的类
* */
public class UserDao2 {

    //声明JDBCTemplate对象共用

    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());

    /*
    * 登录方法
    * @param LoginUser 只有用户名和密码
    * @return 包括用户的全部数据,如果没有查询到，就返回null
    * */
    public UserLei login(UserLei loginUser){


        String sql = "SELECT * FROM user where username = ? and password = ?";

        try {
            UserLei user_result = jdbcTemplate.queryForObject(sql,
                        new BeanPropertyRowMapper<UserLei>(UserLei.class),
                        loginUser.getUsername(), loginUser.getPassword());
            return user_result;
        } catch (DataAccessException e) {
            e.printStackTrace();//记录日志
            return null;
        }


    }
}
