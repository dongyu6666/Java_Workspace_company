package dao;

import org.mybatis.spring.SqlSessionTemplate;
import pojo.UserLei;

import java.util.List;

public class UserMapperImpl implements UserMapper {
    //所有操作之前都使用sqlSession执行，现在使用sqlSessionTemplate
    private SqlSessionTemplate sqlSession;
    //Spring的注入思想，一定要加set方法
    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }



    public List<UserLei> selectUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserLei user = new UserLei(100,"zhangsan","xxx");
        mapper.addUser(user);
        mapper.deleteUser(100);

        return mapper.selectUser();
    }


    public int addUser(UserLei userLei) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        return mapper.addUser(userLei);
    }


    public int deleteUser(int id) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.deleteUser(id);

    }
}
