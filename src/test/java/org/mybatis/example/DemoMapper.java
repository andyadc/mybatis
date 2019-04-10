package org.mybatis.example;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DemoMapper {
    int deleteByPrimaryKey(Long id);

    int insertSelective(Demo record);

    Demo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Demo record);

    List<Demo> selectByTypeList(List<Integer> types);

    List<Demo> selectByTypeArray(Integer[] types);
}