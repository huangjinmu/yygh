package com.jim.yygh.service;

import com.jim.yygh.entity.po.Ysxx;
import com.jim.yygh.entity.vo.YsxxCustom;

import java.util.List;

/**
 * Created by jim on 2017/3/22.
 */
public interface IYsxxService {
    //增加医生信息
    public int  addYsxx(Ysxx ysxx);

    public Ysxx  getYsxx(Ysxx ysxx);

    public Ysxx  getYsxx(String id);
    public List<YsxxCustom> findYsxxByKsId(String id);

}
