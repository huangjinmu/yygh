package com.jim.yygh.service.impl;

import com.jim.yygh.dao.YhGncdSwjgDao;
import com.jim.yygh.entity.po.YhGncdSwjg;
import com.jim.yygh.utils.UUIDBuild;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jim on 2017/4/12.
 */
@Service
public class YhGncdSwjgService {

@Autowired
 private  YhGncdSwjgDao yhGncdSwjgDao;
    //查询所有停用标志为N的记录
    public List<YhGncdSwjg> getGncdControl(){

        return yhGncdSwjgDao.getGncdControl();
    }

    //根据税务机关代码查询停用标志为N的记录
    public List<YhGncdSwjg> getGncdControlBySwjgdm(String swjgdm){
        return yhGncdSwjgDao.getGncdControlBySwjgdm(swjgdm);
    }

    //根据多条件查询
    public List<YhGncdSwjg> getGncdControlByYhGncdSwjg(YhGncdSwjg yhGncdSwjg) {
        return yhGncdSwjgDao.getGncdControlByYhGncdSwjg(yhGncdSwjg);
    }

    //添加屏蔽菜单记录
    public int addYhGncdSwjg(YhGncdSwjg yhGncdSwjg){
      /*  yhGncdSwjg.setControlId(UUIDBuild.getUUID());*/
        int i = yhGncdSwjgDao.addYhGncdSwjg(yhGncdSwjg);
        return i;
    }

    //根据主键修改屏蔽菜单记录
    public int updateYhGncdSwjg(YhGncdSwjg yhGncdSwjg){


         return yhGncdSwjgDao.updateYhGncdSwjg(yhGncdSwjg);


    }

    //根据主键删除屏蔽菜单记录
    public int deleteYhGncdSwjgById(String controlId){


        return yhGncdSwjgDao.deleteYhGncdSwjgById(controlId);
    }

}
