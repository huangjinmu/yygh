package com.jim.yygh.dao;

import com.jim.yygh.entity.po.RolePerm;
import com.jim.yygh.entity.po.RolePermExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RolePermMapper {
    int countByExample(RolePermExample example);

    int deleteByExample(RolePermExample example);

    int deleteByPrimaryKey(String id);

    int insert(RolePerm record);

    int insertSelective(RolePerm record);

    List<RolePerm> selectByExample(RolePermExample example);

    RolePerm selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RolePerm record, @Param("example") RolePermExample example);

    int updateByExample(@Param("record") RolePerm record, @Param("example") RolePermExample example);

    int updateByPrimaryKeySelective(RolePerm record);

    int updateByPrimaryKey(RolePerm record);
}