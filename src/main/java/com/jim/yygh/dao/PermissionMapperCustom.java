package com.jim.yygh.dao;

import com.jim.yygh.entity.vo.PermissionCustom;
import com.jim.yygh.entity.vo.PermissionQueryVo;

import java.util.List;

/**
 * Created by jim on 2017/4/10.
 */
public interface PermissionMapperCustom {
   /**
     * 获得有分页的列表
     *
     */
    List<PermissionCustom> getList(PermissionQueryVo t);

    /**
     * 获取总数
     */
    int findCountTotal(PermissionQueryVo t);
    /**
     * 增加
     * @return 是否成功
     */
    int add(PermissionQueryVo t);

    /**
     * 更新信息
     * @param t
     * @return 是否成功
     */
    int update(PermissionQueryVo t);

    /**
     * 通过id找到该bean
     * @param id id
     * @return bean
     */
    PermissionCustom findById(String  id);

    /**
     * 根据id删除bean
     *a
     * @param id id
     */
    int deleteById(String id);
}
