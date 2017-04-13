package com.jim.yygh.entity.vo;

import java.util.Iterator;
import java.util.List;

import com.jim.yygh.entity.po.User;
import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * 用户身份信息，存入session
 * 由于tomcat将session会序列化在本地硬盘上，所以使用Serializable接口
 * @author Thinkpad
 *
 */
public class  UserQueryVo  {
    private PageQuery pageQuery;

    private  UserCustom userCustom;

    public PageQuery getPageQuery() {
        return pageQuery;
    }

    public void setPageQuery(PageQuery pageQuery) {
        this.pageQuery = pageQuery;
    }

    public UserCustom getUserCustom() {
        return userCustom;
    }

    public void setUserCustom(UserCustom userCustom) {
        this.userCustom = userCustom;
    }
}
