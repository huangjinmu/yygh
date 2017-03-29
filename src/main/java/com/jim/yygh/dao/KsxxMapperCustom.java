package com.jim.yygh.dao;

import com.jim.yygh.entity.vo.KsxxCustom;
import com.jim.yygh.entity.vo.KsxxQueryVo;

import java.util.List;

/**
 * Created by jim on 2017/3/23.
 */
public interface KsxxMapperCustom {

    //查询科室列表
    public List<KsxxCustom>  findKsxxList(KsxxQueryVo ksxxQueryVo) throws Exception;

    //查询科室个数
    public int  findKsxxCount(KsxxQueryVo ksxxQueryVo) throws Exception;

    public List<KsxxCustom>   findAllKsxx(int pid);


}
