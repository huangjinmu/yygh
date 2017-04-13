package com.jim.yygh.service.impl;

import com.jim.yygh.entity.vo.SysRoleCustom;
import com.jim.yygh.entity.vo.SysRoleQueryVo;
import com.jim.yygh.entity.vo.UserRoleCustom;
import com.jim.yygh.entity.vo.UserRoleQueryVo;
import com.jim.yygh.service.IUserRoleService;

import java.util.List;

/**
 * Created by jim on 2017/4/10.
 */
public class UserRoleServiceImpl extends BaseService<UserRoleQueryVo,UserRoleCustom> implements IUserRoleService {
    @Override
    public List<UserRoleCustom> getList(UserRoleQueryVo userRoleQueryVo) {
        return null;
    }

    @Override
    public int findCountTotal(UserRoleQueryVo userRoleQueryVo) {
        return 0;
    }

    @Override
    public boolean add(UserRoleQueryVo userRoleQueryVo) {
        return false;
    }

    @Override
    public boolean update(UserRoleQueryVo userRoleQueryVo) {
        return false;
    }

    @Override
    public UserRoleCustom findById(String id) {
        return null;
    }

    @Override
    public boolean deleteById(String id) {
        return false;
    }
}
