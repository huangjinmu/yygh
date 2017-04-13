package com.jim.yygh.service.impl;

import com.jim.yygh.entity.vo.PermissionCustom;
import com.jim.yygh.entity.vo.UserCustom;
import com.jim.yygh.entity.vo.UserQueryVo;
import com.jim.yygh.service.IUserService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by jim on 2017/4/10.
 */
@Service
public class UserServiceImpl extends  BaseService<UserQueryVo,UserCustom> implements IUserService{
    private static Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
    @Override
    public List<UserCustom> getList(UserQueryVo userQueryVo) {
        if (userQueryVo==null){
            new RuntimeException("用户信息不能为空");
        }
        log.debug("用户permissionQueryVo"+userMapperCustom.toString());
        List<UserCustom> list = userMapperCustom.getList(userQueryVo);
        log.debug("用户getList"+list.toString());

        return list;
    }

    @Override
    public int findCountTotal(UserQueryVo userQueryVo) {
        return userMapperCustom.findCountTotal(userQueryVo);
    }

    @Override
    public boolean add(UserQueryVo userQueryVo) {
        boolean flag=false;
        if (userQueryVo==null){
            new RuntimeException("用户信息不能为空");
        }else {
            UserCustom userCustom = userQueryVo.getUserCustom();
            if (StringUtils.isBlank(userCustom.getId())){
                new RuntimeException("用户Id不能为空");
            }
            if (StringUtils.isBlank(userCustom.getEmail())){
                new RuntimeException("用户Email不能为空");
            } if (StringUtils.isBlank(userCustom.getPassword())){
                new RuntimeException("用户密码不能为空");
            } if (StringUtils.isBlank(userCustom.getPhone())){
                new RuntimeException("用户电话号码不能为空");
            } if (StringUtils.isBlank(userCustom.getSex())){
                new RuntimeException("用户性别不能为空");
            }
            userCustom.setCreatetime(new Date());
            userCustom.setStatus("0");
            userQueryVo.setUserCustom(userCustom);
            int i = userMapperCustom.add(userQueryVo);
            if (i!=0){
                flag=true;
            }
        }
        return flag;
    }

    @Override
    public boolean update(UserQueryVo userQueryVo) {
        Boolean flag=false;
        if (userQueryVo!=null){
            UserCustom userCustom = userQueryVo.getUserCustom();

            if (userCustom!=null){
                String id = userCustom.getId();
                if (StringUtils.isBlank(id)){
                    throw new RuntimeException("更新的内容Id为空");
                }
                log.debug("用户update"+userQueryVo.toString());
                int update = userMapperCustom.update(userQueryVo);
                log.debug("用户update"+update);
                if (update!=0){
                    flag=true;
                }
            }
        }
        return flag;

    }

    @Override
    public UserCustom findById(String id) {
        if (StringUtils.isBlank(id)){
            throw new RuntimeException("要查询用户的id不能为空");
        }
        log.debug("用户findById"+id);
        UserCustom userCustom = userMapperCustom.findById(id);

        log.debug("用户findById"+userCustom.toString());
        return userCustom;
    }

    @Override
    public boolean deleteById(String id) {
        Boolean flag=false;
        if (StringUtils.isBlank(id)){
            throw new RuntimeException("要删除用户的id不能为空");
        }
        log.debug("用户deleteById"+id);
        int i = userMapperCustom.deleteById(id);
        if(i!=0){
            flag=true;
        }

        return flag;
    }
}
