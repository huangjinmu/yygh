package com.jim.yygh.dao;

import com.jim.yygh.entity.vo.SysRoleCustom;
import com.jim.yygh.entity.vo.SysRoleQueryVo;

import java.util.List;

/**
 * Created by jim on 2017/4/11.
 */
public interface RoleMapperCustom {
    /**
     * 获得有分页的列表com.jim.yygh.entity.vo.SysRoleQueryVo
     *
     */
    List<SysRoleCustom> getList(SysRoleQueryVo t);

    /**
     * 获取总数
     */
    int findCountTotal(SysRoleQueryVo t);
    /**
     * 增加
     * @return 是否成功
     */
    int add(SysRoleQueryVo t);

    /**
     * 更新信息
     * @param t
     * @return 是否成功
     */
    int update(SysRoleQueryVo t);

    /**
     * 通过id找到该beancom.jim.yygh.entity.vo.SysRoleCustom
     * @param id id
     * @return bean
     */
    SysRoleCustom findById(String  id);

    /**
     * 根据id删除bean
     *a
     * @param id id
     */
    int deleteById(String id);
}
