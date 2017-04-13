package com.jim.yygh.dao;

import com.jim.yygh.entity.vo.UserRoleCustom;
import com.jim.yygh.entity.vo.UserRoleQueryVo;

import java.util.List;

/**
 * Created by jim on 2017/4/11.
 */
public interface UserRoleMapperCustom {
    /**
     * 获得有分页的列表
     *
     */
    List<UserRoleCustom> getList(UserRoleQueryVo t);

    /**
     * 获取总数
     */
    int findCountTotal(UserRoleQueryVo t);
    /**
     * 增加
     * @return 是否成功
     */
    int add(UserRoleQueryVo t);

    /**
     * 更新信息
     * @param t
     * @return 是否成功
     */
    int update(UserRoleQueryVo t);

    /**
     * 通过id找到该bean
     * @param id id
     * @return bean
     */
    UserRoleCustom findById(String  id);

    /**
     * 根据id删除bean
     *a
     * @param id id
     */
    int deleteById(String id);
}
