package com.jim.yygh.dao;

import com.jim.yygh.entity.po.Ysxx;
import com.jim.yygh.entity.po.YsxxExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface YsxxMapper {
    int countByExample(YsxxExample example);

    int deleteByExample(YsxxExample example);

    int deleteByPrimaryKey(String id);

    int insert(Ysxx record);

    int insertSelective(Ysxx record);

    List<Ysxx> selectByExample(YsxxExample example);

    Ysxx selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Ysxx record, @Param("example") YsxxExample example);

    int updateByExample(@Param("record") Ysxx record, @Param("example") YsxxExample example);

    int updateByPrimaryKeySelective(Ysxx record);

    int updateByPrimaryKey(Ysxx record);
}