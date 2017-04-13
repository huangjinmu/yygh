package com.jim.yygh.dao;

import com.jim.yygh.entity.vo.PermissionQueryVo;
import com.jim.yygh.entity.vo.UserCustom;
import com.jim.yygh.entity.vo.UserQueryVo;

import java.util.List;

/**
 * Created by jim on 2017/4/11.
 */
public interface UserMapperCustom {
    /**
     * 获得有分页的列表
     *
     */
    List<UserCustom> getList(UserQueryVo t);

    /**
     * 获取总数
     */
    int findCountTotal(UserQueryVo t);
    /**
     * 增加
     * @return 是否成功
     */
    int add(UserQueryVo t);

    /**
     * 更新信息
     * @param t
     * @return 是否成功
     */
    int update(UserQueryVo t);

    /**
     * 通过id找到该bean
     * @param id id
     * @return bean
     */
    UserCustom findById(String  id);

    /**
     * 根据id删除bean
     *a
     * @param id id
     */
    int deleteById(String id);
}
