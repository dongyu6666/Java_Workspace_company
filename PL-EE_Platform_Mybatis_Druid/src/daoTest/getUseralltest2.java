package daoTest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.util.TypeUtils;
import dao.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.API;
import pojo.UserLei;
import utils.MybatisUtils;

import java.util.List;

public class getUseralltest2 {
    //查询全部用户
    @Test
    public void getUserAll() {
        //解决fastjson问题，Bean对象的属性字段首字母默认被转成了小写形式
        TypeUtils.compatibleWithJavaBean =true;
        //获得SqlSession对象
        API api2 = new API();
        api2.setStatus("true");

        api2.setInfo("offer all users info");
        //声明变量
        SqlSession sqlSession = null;
        UserMapper mapper = null;
        List<UserLei> userlist = null;
        String list= null;

        try {
            //解决fastjson问题，Bean对象的属性字段首字母默认被转成了小写形式
            TypeUtils.compatibleWithJavaBean =true;
            sqlSession = MybatisUtils.getSqlSession();

            //方式1：getMapper
            mapper = sqlSession.getMapper(UserMapper.class);
            // get alluser from Mysql, userlist is list
            userlist = mapper.getUserAll();
            //transform alluser to JSON String
            list = JSON.toJSONString(userlist);
            //transform to JSONArray
            JSONArray array = JSONArray.parseArray(list);
            //set array
            api2.setPara(array);

            sqlSession.close();

        } catch (Exception e) {
            e.printStackTrace();

            //set error info if catches
            api2.setStatus("false");
            api2.setError(e.getCause().getMessage());

        }
        // transform to JSONString and output to Client

        String  alluser_JSON = JSON.toJSONString(api2);
        System.out.println(alluser_JSON);
        // transform to JSONSObject and output to Client
        /*JSONObject jsonObject = JSONObject.parseObject(alluser_JSON);
        System.out.println(jsonObject);*/


    }
}