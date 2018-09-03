package org.open.demo.dao;

import org.open.demo.model.Hotnews3;

public interface Hotnews3Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Hotnews3 record);

    int insertSelective(Hotnews3 record);

    Hotnews3 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hotnews3 record);

    int updateByPrimaryKey(Hotnews3 record);
}