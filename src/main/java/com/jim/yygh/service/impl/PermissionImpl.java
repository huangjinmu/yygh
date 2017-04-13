package com.jim.yygh.service.impl;

import com.jim.yygh.entity.vo.PermissionCustom;
import com.jim.yygh.entity.vo.PermissionQueryVo;
import com.jim.yygh.service.IPermissionService;
import lombok.extern.slf4j.*;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by jim on 2017/4/10.
 */


@Service
public class PermissionImpl extends BaseService<PermissionQueryVo,PermissionCustom> implements IPermissionService {

    private static Logger log = LoggerFactory.getLogger(PermissionImpl.class);


    @Override
    public List<PermissionCustom> getList(PermissionQueryVo permissionQueryVo)throws Exception {
        List<PermissionCustom> list=null;
        if (permissionQueryVo!=null){
            log.debug("权限permissionQueryVo"+permissionQueryVo.toString());
            list = permissionMapperCustom.getList(permissionQueryVo);
            log.debug("权限getList"+list.toString());
        }

        return list;
    }

    @Override
    public int findCountTotal(PermissionQueryVo permissionQueryVo)throws Exception {
        log.debug("权限findCountTotal"+permissionQueryVo.toString());
        return permissionMapperCustom.findCountTotal(permissionQueryVo);
    }

    @Override
    public boolean add(PermissionQueryVo permissionQueryVo) throws Exception {
        Boolean flag=false;
        if (permissionQueryVo.getPermissionCustom()==null){
            throw  new RuntimeException("权限信息不能为空");
        }
        PermissionCustom permissionCustom = permissionQueryVo.getPermissionCustom();
        if (StringUtils.isBlank(permissionCustom.getName())){
            throw  new RuntimeException("权限名不能为空");
        }
        if (StringUtils.isBlank(permissionCustom.getUrl())){
            throw  new RuntimeException("菜单Url不能为空");
        }
        if (StringUtils.isBlank(permissionCustom.getType())){
            throw  new RuntimeException("菜单类型不能为空");
        }
        log.debug("权限findCountTotal"+permissionQueryVo.toString());
        int add = permissionMapperCustom.add(permissionQueryVo);
        log.debug("权限add"+add);
        if (add!=0){
            flag=true;
        }
        return flag;
    }

    @Override
    public boolean update(PermissionQueryVo permissionQueryVo) throws Exception{
        Boolean flag=false;
       if (permissionQueryVo!=null){
           PermissionCustom permissionCustom = permissionQueryVo.getPermissionCustom();
           if (permissionCustom!=null){
               String id = permissionCustom.getId();
               if (StringUtils.isBlank(id)){
                   throw new RuntimeException("更新的内容Id为空");
               }
               log.debug("权限update"+permissionQueryVo.toString());
               int update = permissionMapperCustom.update(permissionQueryVo);
               log.debug("权限update"+update);
               if (update!=0){
                   flag=true;
               }
           }
       }
        return flag;
    }

    @Override
    public PermissionCustom findById(String id)throws Exception {
    if (StringUtils.isBlank(id)){
        throw new RuntimeException("要查询权限的id不能为空");
    }
        log.debug("权限findById"+id);
        PermissionCustom PermissionCustom = permissionMapperCustom.findById(id);
        log.debug("权限findById"+PermissionCustom.toString());
        return PermissionCustom;
    }

    @Override
    public boolean deleteById(String id) throws Exception{
        Boolean flag=false;
        if (StringUtils.isBlank(id)){
            throw new RuntimeException("要删除权限的id不能为空");
        }
        log.debug("权限deleteById"+id);
        int i = permissionMapperCustom.deleteById(id);
        if(i!=0){
            flag=true;
        }

        return flag;
    }
}
