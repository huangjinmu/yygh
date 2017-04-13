package com.jim.yygh.service;



import java.util.List;

/**
 * 基础服务
 * Created by ange on 2016/9/26.
 */
public interface IBaseService<T,V> {
    
    /**
     * 获得有分页的列表
     *
     */
    List<V> getList(T t) throws Exception;

    /**
     * 获取总数
     */
    int findCountTotal(T t) throws Exception;
    /**
     * 增加
     * @return 是否成功
     */
    boolean add(T t) throws Exception;

    /**
     * 更新信息
     * @param t
     * @return 是否成功
     */
    boolean update(T t) throws Exception;

    /**
     * 通过id找到该bean
     * @param id id
     * @return bean
     */
    V findById(String  id) throws Exception;

    /**
     * 根据id删除bean
     *a
     * @param id id
     */
    boolean deleteById(String id) throws Exception;
}
