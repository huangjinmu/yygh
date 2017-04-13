package com.jim.yygh.service.impl;

import com.jim.yygh.entity.vo.SysRoleCustom;
import com.jim.yygh.entity.vo.SysRoleQueryVo;
import com.jim.yygh.service.ISysRoleService;
import com.jim.yygh.utils.UUIDBuild;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by jim on 2017/4/10.
 */
public class SysRoleServiceImpl extends BaseService <SysRoleQueryVo,SysRoleCustom> implements ISysRoleService{
    private static Logger log = LoggerFactory.getLogger(SysRoleServiceImpl.class);

    @Override
    public List<SysRoleCustom> getList(SysRoleQueryVo sysRoleQueryVo)throws Exception {
        List<SysRoleCustom> list=null;
        if (sysRoleQueryVo!=null){
            SysRoleCustom sysRoleCustom = sysRoleQueryVo.getSysRoleCustom();

            log.debug("角色sysRoleQueryVo"+sysRoleQueryVo.toString());
            list = roleMapperCustom.getList(sysRoleQueryVo);
            log.debug("角色getList"+list.toString());
        }

        return list;
    }

    @Override
    public int findCountTotal(SysRoleQueryVo sysRoleQueryVo)throws Exception {
        log.debug("角色findCountTotal"+sysRoleQueryVo.toString());
        return roleMapperCustom.findCountTotal(sysRoleQueryVo);
    }

    @Override
    public boolean add(SysRoleQueryVo sysRoleQueryVo) throws Exception {
        Boolean flag=false;
        if (sysRoleQueryVo.getSysRoleCustom()==null){
            throw  new RuntimeException("角色信息不能为空");
        }
        SysRoleCustom sysRoleCustom = sysRoleQueryVo.getSysRoleCustom();
        if (StringUtils.isBlank(sysRoleCustom.getName())){
            throw  new RuntimeException("角色名不能为空");
        }
        sysRoleCustom.setId(UUIDBuild.getUUID());
        sysRoleCustom.setAvailable("0");
        sysRoleQueryVo.setSysRoleCustom(sysRoleCustom);
        log.debug("权限findCountTotal"+sysRoleQueryVo.toString());
        int add = roleMapperCustom.add(sysRoleQueryVo);
        log.debug("权限add"+add);
        if (add!=0){
            flag=true;
        }
        return flag;
    }

    @Override
    public boolean update(SysRoleQueryVo sysRoleQueryVo) throws Exception{
        Boolean flag=false;
        if (sysRoleQueryVo!=null){
            SysRoleCustom sysRoleCustom = sysRoleQueryVo.getSysRoleCustom();
            if (sysRoleCustom!=null){
                String id = sysRoleCustom.getId();
                if (StringUtils.isBlank(id)){
                    throw new Exception("更新的内容Id为空");
                }
                log.debug("权限update"+sysRoleQueryVo.toString());
                int update = roleMapperCustom.update(sysRoleQueryVo);
                log.debug("权限update"+update);
                if (update!=0){
                    flag=true;
                }
            }
        }
        return flag;
    }

    @Override
    public SysRoleCustom findById(String id)throws Exception {
        if (StringUtils.isBlank(id)){
            throw new RuntimeException("要查询权限的id不能为空");
        }
        log.debug("权限findById"+id);
        SysRoleCustom sysRoleCustom = roleMapperCustom.findById(id);
        log.debug("权限findById"+sysRoleCustom.toString());
        return sysRoleCustom;
    }

    @Override
    public boolean deleteById(String id) throws Exception{
        Boolean flag=false;
        if (StringUtils.isBlank(id)){
            throw new RuntimeException("要删除权限的id不能为空");
        }
        log.debug("权限deleteById"+id);
        if(this.findById(id)==null){
            throw new RuntimeException("没有你找到要删除的角色");
        }
        int i = roleMapperCustom.deleteById(id);
        if(i!=0){
            flag=true;
        }

        return flag;
    }
}
