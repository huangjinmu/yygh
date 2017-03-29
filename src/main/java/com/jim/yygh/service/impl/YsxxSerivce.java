package com.jim.yygh.service.impl;

import com.jim.yygh.dao.YsxxMapper;
import com.jim.yygh.entity.po.Ysxx;
import com.jim.yygh.entity.vo.YsxxCustom;
import com.jim.yygh.service.IYsxxService;
import com.jim.yygh.utils.UUIDBuild;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jim on 2017/3/22.
 */
@Service
public class YsxxSerivce implements IYsxxService {


    @Autowired
    private YsxxMapper ysxxMapper;


    public int  addYsxx(Ysxx ysxx){
        int insert=0;
        if(ysxx!=null){
            ysxx.setId(UUIDBuild.getUUID());
            insert = ysxxMapper.insert(ysxx);
        }

        return  insert;

    }
    public Ysxx getYsxx(String id) {
        return null;
    }

    @Override
    public List<YsxxCustom> findYsxxByKsId(String id) {
        return null;
    }

    public Ysxx getYsxx(Ysxx ysxx) {
        return null;
    }
}
