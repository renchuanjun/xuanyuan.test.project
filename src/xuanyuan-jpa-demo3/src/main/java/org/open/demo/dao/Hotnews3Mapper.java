package org.open.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.open.demo.model.Hotnews3;

@Mapper
public interface Hotnews3Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Hotnews3 record);

    int insertSelective(Hotnews3 record);

    Hotnews3 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hotnews3 record);

    int updateByPrimaryKey(Hotnews3 record);
}