package com.jim.yygh.service.impl;


import com.jim.yygh.dao.*;

import com.jim.yygh.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 基础服务
 * Created by ange on 2016/9/26.
 */
public abstract class BaseService<T,V> implements IBaseService<T,V> {


    @Autowired
    public YsxxMapperCustom ysxxMapperCustom;
    @Autowired
    public PermissionMapperCustom permissionMapperCustom;
    @Autowired
    public RolePermissionMapperCustom rolePermissionMapperCustom;
    @Autowired
    public RoleMapperCustom roleMapperCustom;
    @Autowired
    public UserRoleMapperCustom userRoleMapperCustom;
    @Autowired
    public UserMapperCustom userMapperCustom;

}

