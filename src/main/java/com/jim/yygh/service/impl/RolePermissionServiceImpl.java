package com.jim.yygh.service.impl;

import com.jim.yygh.entity.vo.RolePermCustom;
import com.jim.yygh.entity.vo.RolePermQueryVo;
import com.jim.yygh.service.IRolePermissionService;
import com.jim.yygh.utils.UUIDBuild;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by jim on 2017/4/10.
 */
public class RolePermissionServiceImpl extends BaseService<RolePermQueryVo,RolePermCustom> implements IRolePermissionService {
    private static Logger log = LoggerFactory.getLogger(RolePermissionServiceImpl.class);


    @Override
    public List<RolePermCustom> getList(RolePermQueryVo rolePermQueryVo)throws Exception {
        List<RolePermCustom> list=null;
        if (rolePermQueryVo!=null){
            log.debug("角色权限rolePermQueryVo"+rolePermQueryVo.toString());
            list = rolePermissionMapperCustom.getList(rolePermQueryVo);
            log.debug("角色权限getList"+list.toString());
        }

        return list;
    }

    @Override
    public int findCountTotal(RolePermQueryVo rolePermQueryVo)throws Exception {
        log.debug("权限findCountTotal"+rolePermQueryVo.toString());
        return rolePermissionMapperCustom.findCountTotal(rolePermQueryVo);
    }

    @Override
    public boolean add(RolePermQueryVo rolePermQueryVo) throws Exception {
        Boolean flag=false;
        if (rolePermQueryVo.getRolePermCustom()==null){
            throw  new RuntimeException("角色权限信息不能为空");
        }else {
            RolePermCustom rolePermCustom = rolePermQueryVo.getRolePermCustom();
            if (StringUtils.isBlank(rolePermCustom.getRoleId())){
                throw  new RuntimeException("角色id不能为空");
            }
            if (StringUtils.isBlank(rolePermCustom.getPermId())){
                throw  new RuntimeException("菜单id不能为空");
            }
            rolePermCustom.setId(UUIDBuild.getUUID());
            rolePermQueryVo.setRolePermCustom(rolePermCustom);
            log.debug("角色权限findCountTotal"+rolePermQueryVo.toString());
            int add = rolePermissionMapperCustom.add(rolePermQueryVo);
            log.debug("角色权限add"+add);
            if (add!=0){
                flag=true;
            }
        }

        return flag;
    }

    @Override
    public boolean update(RolePermQueryVo rolePermQueryVo) throws Exception{
        Boolean flag=false;
        if (rolePermQueryVo!=null){
            RolePermCustom rolePermCustom = rolePermQueryVo.getRolePermCustom();
            if (rolePermCustom!=null){
                String id = rolePermCustom.getId();
                if (StringUtils.isBlank(id)){
                    throw new Exception("更新的内容Id为空");
                }
                log.debug("角色权限update"+rolePermQueryVo.toString());
                int update = rolePermissionMapperCustom.update(rolePermQueryVo);
                log.debug("角色权限update"+update);
                if (update!=0){
                    flag=true;
                }
            }
        }
        return flag;
    }

    @Override
    public RolePermCustom findById(String id)throws Exception {
        if (StringUtils.isBlank(id)){
            throw new RuntimeException("要查询角色权限的id不能为空");
        }
        log.debug("权限findById"+id);
        RolePermCustom rolePermCustom = rolePermissionMapperCustom.findById(id);
        log.debug("权限findById"+rolePermCustom.toString());
        return rolePermCustom;
    }

    @Override
    public boolean deleteById(String id) throws Exception{
        Boolean flag=false;
        if (StringUtils.isBlank(id)){
            throw new RuntimeException("要删除角色权限的id不能为空");
        }
        log.debug("权限deleteById"+id);
        if (this.findById(id)!=null) {
            throw new RuntimeException("要删除角色权限不能为空");
        }else {
            int i = rolePermissionMapperCustom.deleteById(id);
            if(i!=0){
                flag=true;
            }
        }


        return flag;
    }
}
