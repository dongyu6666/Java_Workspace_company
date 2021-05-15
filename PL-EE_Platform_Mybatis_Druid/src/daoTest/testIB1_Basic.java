package daoTest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import dao.IB1_BasicMapper;
import dao.IB1_DOC_INFO_CONTACTSMapper;
import dao.IB1_DOC_INFO_DOC_REVISIONSMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.*;
import utils.MybatisUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class testIB1_Basic {
    //查询全部
    @Test
    public void getTTT() {


        //获得SqlSession对象
        API api = new API();
        api.setStatus("true");
        api.setInfo("offer all IB1_Basic info");
        api.setError("null");

        //声明变量
        SqlSession sqlSession = null;
        IB1_BasicMapper mapper = null;
        List<IB1_BasicLei> IB1_Basiclist = null;
        String list= null;



        try {
            sqlSession = MybatisUtils.getSqlSession();
            // getMapper
            mapper = sqlSession.getMapper(IB1_BasicMapper.class);

            Map map = new HashMap();
            map.put("platform_name", "MEB");
            map.put("IB1_VERSION", "1_6");
            map.put("diagnose_adr", "0009");

            //get IB1_Basic from Mysql, IB1_Basiclist is list
            IB1_Basiclist = mapper.getIB1_Basic(map);
            //transform IB1_Basic to JSON String

            System.out.println("从数据库读出的list："+ IB1_Basiclist);


            list = JSON.toJSONString(IB1_Basiclist);

            System.out.println("list转成JSONString的："+ list);
            //transform to JSONArray
            JSONArray array = JSONArray.parseArray(list);

            System.out.println("JSONString转成JSONArray的："+ array);

            //set JSONArray in api
            api.setPara(array);
            //close session
            sqlSession.close();
        } catch (Exception e) {
            e.printStackTrace();
//set error info if catches
            api.setStatus("false");
            api.setError(e.getCause().getMessage());

        }

        // transform to JSONString and output to Client
        String  IB1_Basic_JSON = JSON.toJSONString(api);
        System.out.println("输出到前端："+ IB1_Basic_JSON);

    }
}