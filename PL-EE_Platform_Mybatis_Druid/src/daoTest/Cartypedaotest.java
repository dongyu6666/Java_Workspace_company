package daoTest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.util.TypeUtils;
import dao.CartypeMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.CartypeLei;
import utils.MybatisUtils;

import java.util.List;

public class Cartypedaotest {
    //查询全部车型
    @Test
    public void getCartype(){
        //解决fastjson问题，Bean对象的属性字段首字母默认被转成了小写形式
        TypeUtils.compatibleWithJavaBean =true;
        //获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //方式1：getMapper
        CartypeMapper mapper = sqlSession.getMapper(CartypeMapper.class);
        List<CartypeLei> cartype = mapper.getCartype();

        /*for (UserLei userLei : userlist) {
            System.out.println(userLei);
        }*/

        String cartype_result = JSON.toJSONString(cartype);
        System.out.println(cartype_result);
        sqlSession.close();

    }

}
