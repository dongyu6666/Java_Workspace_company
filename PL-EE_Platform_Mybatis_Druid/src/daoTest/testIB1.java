package daoTest;

import com.alibaba.fastjson.JSON;
import dao.IB1_BasicMapper;
import dao.IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_DIAG_PARAMETERSMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.IB1_BasicLei;
import utils.MybatisUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class testIB1 {
    //查询全部
    @Test
    public void getTTT() {

        //声明变量
        SqlSession sqlSession = null;
        IB1_BasicMapper mapper = null;
        List<IB1_BasicLei> IB1_Basiclist = null;
        String list= null;

        try {
            sqlSession = MybatisUtils.getSqlSession();

            //方式1：getMapper
            //mapper = sqlSession.getMapper(IB1_PROCEDURES_PROCEDURE_BLOCK_STEPS_STEP_DIAG_PARAMETERSMapper.class);
            mapper = sqlSession.getMapper(IB1_BasicMapper.class);
            Map map = new HashMap();
            List<IB1_BasicLei> ib1_diagnose_adr_and_ib1_name = mapper.getIB1_diagnose_adr_and_IB1_NAME(map);

            //System.out.println("userlist:"+ userlist);
            //transform alluser to JSON String
            list = JSON.toJSONString(ib1_diagnose_adr_and_ib1_name);

            System.out.println(list);

            sqlSession.close();

        } catch (Exception e) {
            e.printStackTrace();

        }

}
}