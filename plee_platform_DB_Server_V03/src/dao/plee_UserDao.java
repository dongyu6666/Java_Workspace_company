package dao;

import JDBCUtils.JDBCUtils;
import domain.plee_UserLei;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/*
* 操作数据库中User表的类
* */
public class plee_UserDao {

    //声明JDBCTemplate对象共用
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());


    /*
    * 登录方法
    * @param LoginUser 只有用户名和密码
    * @return 包括用户的全部数据,如果没有查询到，就返回null
    * */
    public plee_UserLei login(plee_UserLei plee_loginUser){


        String sql = "SELECT * FROM user where username = ? and password = ? ";

        try {
            plee_UserLei user_result = jdbcTemplate.queryForObject(sql,
                        new BeanPropertyRowMapper<plee_UserLei>(plee_UserLei.class),
                    plee_loginUser.getUsername(), plee_loginUser.getPassword());
            return user_result;


        } catch (DataAccessException e) {
            e.printStackTrace();//记录日志

            return null;
        }

    }

    /*
     * 插入角色方法insert_role，在role表中
     * @param LoginUser 用户名、密码、角色名字
     * @return 包括用户的全部数据,如果没有查询到，就返回null
     * */
    public plee_UserLei insert_role(plee_UserLei plee_loginUser){

        String sqlX = "SELECT `id` FROM USER WHERE username = ? ;";
        plee_UserLei plee_userLei = jdbcTemplate.queryForObject(sqlX, new BeanPropertyRowMapper<plee_UserLei>(plee_UserLei.class),plee_loginUser.getUsername());
        Integer return_id = plee_userLei.getId();

        String sql2 = "INSERT INTO `plee_platform`.`user_role` (`id`, `uid`, `role_id`) VALUES (?, ?, ?);  ";
        int update = jdbcTemplate.update(sql2, return_id,return_id,plee_loginUser.getRole_name());


        System.out.println("插入角色成功");


        return null;
    }
}
