package com.andyadc.mybatis;

import com.andyadc.mybatis.mapper.DemoMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.InputStream;
import java.util.Date;

/**
 * @author andy.an
 * @since 2018/10/25
 */
public class DemoTest {

    private static SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;

    @BeforeClass
    public static void beforeClass() {
        String resource = "mybatis-config.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Before
    public void before() {
        sqlSession = sqlSessionFactory.openSession();
        System.out.println("sqlSessionFactory: " + sqlSessionFactory);
        System.out.println("sqlSession: " + sqlSession);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }

    @After
    public void close() {
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        sqlSession.close();
    }

    @Test
    public void testSelectNow() {
        DemoMapper mapper = sqlSession.getMapper(DemoMapper.class);
        System.out.println(mapper.selectNow());
    }

    @Test
    public void testSelect() {
        DemoMapper mapper = sqlSession.getMapper(DemoMapper.class);
        System.out.println(mapper.selectByPrimaryKey(1L));
    }

    @Test
    public void testInsert() {
        Demo demo = new Demo();
        demo.setStatus(1);
        demo.setVersion(0);
        demo.setCreatedTime(new Date());
        demo.setUpdatedTime(new Date());

        DemoMapper mapper = sqlSession.getMapper(DemoMapper.class);

        demo.setName("aaa");
        mapper.insertSelective(demo);

//        demo.setName("aaa");
//        mapper.insertSelective(demo);

        sqlSession.commit();
    }

}
