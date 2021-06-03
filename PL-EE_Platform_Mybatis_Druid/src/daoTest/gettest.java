package daoTest;

import com.alibaba.fastjson.JSON;


import com.alibaba.fastjson.util.TypeUtils;
import dao.IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_DIAG_PARAMETERSMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import pojo.IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_DIAG_PARAMETERSLei;
import utils.MybatisUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class gettest {
    //查询全部
    @Test
    public void getTTT() {
        //解决fastjson问题，Bean对象的属性字段首字母默认被转成了小写形式
        TypeUtils.compatibleWithJavaBean =true;
        //声明变量
        SqlSession sqlSession = null;
        IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_DIAG_PARAMETERSMapper mapper = null;
        List<IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_DIAG_PARAMETERSLei> IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_DIAG_PARAMETERSlist = null;
        String list= null;

        try {
            //解决fastjson问题，Bean对象的属性字段首字母默认被转成了小写形式
            TypeUtils.compatibleWithJavaBean =true;
            sqlSession = MybatisUtils.getSqlSession();

            //方式1：getMapper
            //mapper = sqlSession.getMapper(IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_DIAG_PARAMETERSMapper.class);
            mapper = sqlSession.getMapper(IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_DIAG_PARAMETERSMapper.class);
            Map map = new HashMap();
            List<IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_DIAG_PARAMETERSLei> ib1_block_all = mapper.getIB1_BLOCK_All(map);

            //System.out.println("userlist:"+ userlist);
            //transform alluser to JSON String
            list = JSON.toJSONString(ib1_block_all);
            System.out.println(list);

            sqlSession.close();

        } catch (Exception e) {
            e.printStackTrace();


        }



}
}