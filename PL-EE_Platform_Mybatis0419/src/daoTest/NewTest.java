package daoTest;

import com.alibaba.fastjson.JSON;
import dao.UserMapper;
import org.apache.ibatis.session.SqlSession;
import pojo.UserLei;
import utils.MybatisUtils;

import java.util.HashMap;
import java.util.List;

public class NewTest
{
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //方式1：getMapper
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        List<UserLei> userlist=mapper.getUserAll();

        /*for (UserLei userLei : userlist) {
            System.out.println(userLei);
        }*/
        String alluser=JSON.toJSONString(userlist);
        System.out.println(alluser);
        sqlSession.close();
/*
        HashMap<String, String> map=new HashMap<String, String>();
        Boolean status;
        String error;
        String info="offer all users info";*/
    }
}
