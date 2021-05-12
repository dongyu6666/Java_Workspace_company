package daoTest;

import dao.UserMapper;
import net.sf.json.JSONArray;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.UserLei;
import pojo.User_roleLei;
import utils.MybatisUtils;

import java.util.List;

public class Userdaotest {
    //查询全部用户
    @Test
    public void getUserAll(){
        //获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //方式1：getMapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<UserLei> userlist = mapper.getUserAll();

        /*for (UserLei userLei : userlist) {
            System.out.println(userLei);
        }*/
        JSONArray jsonArray = JSONArray.fromObject(userlist);
        System.out.println(jsonArray);

        sqlSession.close();

    }
    //根据用户名username查询用户
    @Test
    public void getUserByUsername(){
        //获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //getMapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<UserLei> userlist = mapper.getUserByUsername("liangdongyu");

        /*for (UserLei userLei : userlist) {
            System.out.println(userLei);
        }*/
        JSONArray jsonArray = JSONArray.fromObject(userlist);
        System.out.println(jsonArray);

        sqlSession.close();

    }

    //insert一个用户
    @Test
    public void addUser_role(){
        //获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //getMapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.addUser_role(new User_roleLei(8, 8, 4));
        System.out.println(i);
        if(i>0){
            System.out.println("insert成功");
        }
        //提交事务
        sqlSession.commit();
        sqlSession.close();

    }

    //update一个用户user_role信息
    @Test
    public void updateUser(){
        //获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //getMapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.updateUser(new User_roleLei(8, 8, 3));

        if(i>0){
            System.out.println("update成功");
        }
        //提交事务
        sqlSession.commit();
        sqlSession.close();

    }

    //delete一个用户
    @Test
    public void deleteUser(){
        //获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //getMapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.deleteUser(9);

        if(i>0){
            System.out.println("delete成功");
        }
        //提交事务
        sqlSession.commit();
        sqlSession.close();

    }
}
