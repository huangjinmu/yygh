package com.jim.yygh.dao;

import com.jim.yygh.entity.vo.RolePermCustom;
import com.jim.yygh.entity.vo.RolePermQueryVo;

import java.util.List;

/**
 * Created by jim on 2017/4/11.
 */
public interface RolePermissionMapperCustom {
    /**
     * 获得有分页的列表
     *
     */
    List<RolePermCustom> getList(RolePermQueryVo t);

    /**
     * 获取总数
     */
    int findCountTotal(RolePermQueryVo t);
    /**
     * 增加
     * @return 是否成功
     */
    int add(RolePermQueryVo t);

    /**
     * 更新信息
     * @param t
     * @return 是否成功
     */
    int update(RolePermQueryVo t);

    /**
     * 通过id找到该bean
     * @param id id
     * @return bean
     */
    RolePermCustom findById(String  id);

    /**
     * 根据id删除bean
     *a
     * @param id id
     */
    int deleteById(String id);
}
