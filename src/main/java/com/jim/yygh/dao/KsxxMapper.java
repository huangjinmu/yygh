package com.jim.yygh.dao;

import com.jim.yygh.entity.po.Ksxx;
import com.jim.yygh.entity.po.KsxxExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface KsxxMapper {
    int countByExample(KsxxExample example);

    int deleteByExample(KsxxExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Ksxx record);

    int insertSelective(Ksxx record);

    List<Ksxx> selectByExample(KsxxExample example);

    Ksxx selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Ksxx record, @Param("example") KsxxExample example);

    int updateByExample(@Param("record") Ksxx record, @Param("example") KsxxExample example);

    int updateByPrimaryKeySelective(Ksxx record);

    int updateByPrimaryKey(Ksxx record);
}