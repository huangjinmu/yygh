package com.jim.yygh.dao;

import com.jim.yygh.entity.vo.PermissionCustom;
import com.jim.yygh.entity.vo.PermissionQueryVo;
import com.jim.yygh.entity.vo.YsxxCustom;
import com.jim.yygh.entity.vo.YsxxQueryVo;

import java.util.List;

/**
 * Created by jim on 2017/4/2.
 */
public interface YsxxMapperCustom {



    /**
     * 获得有分页的列表
     *
     */
    List<YsxxCustom> getList(YsxxQueryVo t);

    /**
     * 获取总数
     */
    int findCountTotal(YsxxQueryVo t);
    /**
     * 增加
     * @return 是否成功
     */
    int add(YsxxQueryVo t);

    /**
     * 更新信息
     * @param t
     * @return 是否成功
     */
    int update(YsxxQueryVo t);

    /**
     * 通过id找到该bean
     * @param id id
     * @return bean
     */
    YsxxCustom findById(String  id);

    /**
     * 根据id删除bean
     *a
     * @param id id
     */
    int deleteById(String id);


/*    public int findYsxxCount(YsxxQueryVo ysxxQueryVo);

    public List<YsxxCustom> findYsxx(YsxxQueryVo ysxxQueryVo);*/
}
