package org.open.demo.dao;


import org.apache.ibatis.annotations.Mapper;
import org.open.demo.model.Hotnews1;

@Mapper
public interface Hotnews1Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Hotnews1 record);

    int insertSelective(Hotnews1 record);

    Hotnews1 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hotnews1 record);

    int updateByPrimaryKeyWithBLOBs(Hotnews1 record);

    int updateByPrimaryKey(Hotnews1 record);
}