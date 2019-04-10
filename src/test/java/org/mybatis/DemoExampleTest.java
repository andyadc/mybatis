package org.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.example.Demo;
import org.mybatis.example.DemoMapper;

import java.io.InputStream;

/**
 * @author andy.an
 * @since 2019/4/10
 */
public class DemoExampleTest {

    public static void main(String[] args) throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        DemoMapper demoMapper = sqlSession.getMapper(DemoMapper.class);
        Demo demo = demoMapper.selectByPrimaryKey(18L);
        System.out.println(demo.getId() + ", " + demo.getName() + ", " + demo.getCreateTime());

        sqlSession.close();
    }
}
