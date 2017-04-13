package com.jim.yygh.entity.vo;

/**
 * Created by jim on 2017/4/10.
 */
public class UserRoleQueryVo {
    private PageQuery pageQuery;
    private UserRoleCustom userRoleCustom;

    public PageQuery getPageQuery() {
        return pageQuery;
    }

    public void setPageQuery(PageQuery pageQuery) {
        this.pageQuery = pageQuery;
    }

    public UserRoleCustom getUserRoleCustom() {
        return userRoleCustom;
    }

    public void setUserRoleCustom(UserRoleCustom userRoleCustom) {
        this.userRoleCustom = userRoleCustom;
    }
}
