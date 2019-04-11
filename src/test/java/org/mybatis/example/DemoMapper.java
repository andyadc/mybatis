package org.mybatis.example;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DemoMapper {

    int insertSelective(Demo record);

    int deleteByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Demo record);

    Demo selectByPrimaryKey(Long id);
}