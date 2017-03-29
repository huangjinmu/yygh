package com.jim.yygh.service;

import com.jim.yygh.entity.po.Ksxx;
import com.jim.yygh.entity.vo.KsxxCustom;
import com.jim.yygh.entity.vo.KsxxQueryVo;

import java.util.List;

/**
 * Created by jim on 2017/3/22.
 */
public interface IKsxxService {


    //增加科室信息
    public int addKsxx(Ksxx ksxx);

    //通过科室id删除科室信息
    public void deleteKsxxById(Integer id);

    //通过科室名删除科室信息
    public void deleteKsxxByName(String name);

    //删除科室信息
    public void deleteKsxx(Ksxx ksxx);

    //查询所有
    public List<KsxxCustom> findAllKsxx(int id);

    //查询科室列表
    public List<KsxxCustom>  findKsxxList(KsxxQueryVo ksxxQueryVo) throws Exception;

    //查询科室个数
    public int  findKsxxCount(KsxxQueryVo ksxxQueryVo) throws Exception;

    //修改科室信息
    public  int  updateKsxxById(Ksxx id);


}
