package org.open.demo.dao;

import org.open.demo.model.Hotnews2;

public interface Hotnews2Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Hotnews2 record);

    int insertSelective(Hotnews2 record);

    Hotnews2 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hotnews2 record);

    int updateByPrimaryKey(Hotnews2 record);
}