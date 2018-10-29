package com.andyadc.mybatis.mapper;

import com.andyadc.mybatis.Demo;

/**
 * @author andy.an
 * @since 2018/10/25
 */
public interface DemoMapper {

    String selectNow();

    int deleteByPrimaryKey(Long id);

    int insert(Demo record);

    int insertSelective(Demo record);

    Demo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Demo record);

    int updateByPrimaryKey(Demo record);
}
