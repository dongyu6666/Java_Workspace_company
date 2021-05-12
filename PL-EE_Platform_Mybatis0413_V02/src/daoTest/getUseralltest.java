package daoTest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import dao.UserMapper;
import org.apache.commons.lang.StringEscapeUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.API;
import pojo.UserLei;
import utils.MybatisUtils;

import java.util.List;

public class getUseralltest {
    //查询全部用户
    @Test
    public void getUserAll() {
        //获得SqlSession对象
        API api = new API();
        api.setStatus("true");

        api.setInfo("offer all users info");
        //声明变量
        SqlSession sqlSession = null;
        UserMapper mapper = null;
        List<UserLei> userlist = null;
        String list= null;

        try {
            sqlSession = MybatisUtils.getSqlSession();

            //方式1：getMapper
            mapper = sqlSession.getMapper(UserMapper.class);
            // get alluser from Mysql, userlist is list
            userlist = mapper.getUserAll();
            System.out.println("userlist:"+ userlist);
            //transform alluser to JSON String
            list = JSON.toJSONString(userlist);
            System.out.println("ransform alluser to JSON String:"+ list);

            //截取字符串
            //String substring = list.substring(1, list.length() - 1);
            //System.out.println("subString:"+ substring);
            //String alluser_quchu = StringEscapeUtils.unescapeJava(list);
            //api.setPara(alluser_quchu);


            //save alluser info String
            //json字符串转化为对象

            //transform alluser to JSON
            //JSONObject alluser_Object = JSONObject.parseObject(list);

            //string to Json object
            //JSONObject jsonObject = JSONObject.parseObject(list);

            //save alluser info String
            //api.setPara(list);

            sqlSession.close();

        } catch (Exception e) {
            e.printStackTrace();

            //set error info if catches
            api.setStatus("false");
            api.setError(e.getCause().getMessage());

        }
        // transform to JSON and output to Client
        System.out.println("api"+ api);
        String  alluser_JSON = JSON.toJSONString(api);

        System.out.println("API_toJSONString"+alluser_JSON);
        //JSONObject jsonObject = JSONObject.parseObject(alluser_JSON);

        JSONObject jsonObject = JSONObject.parseObject(alluser_JSON);
        System.out.println(jsonObject);
    }
}