package com.jim.yygh.entity.vo;

/**
 * Created by jim on 2017/4/10.
 */
public class PermissionQueryVo {
    //分页参数
    private PageQuery pageQuery;

    private PermissionCustom permissionCustom;

    public PageQuery getPageQuery() {
        return pageQuery;
    }

    public void setPageQuery(PageQuery pageQuery) {
        this.pageQuery = pageQuery;
    }

    public PermissionCustom getPermissionCustom() {
        return permissionCustom;
    }

    public void setPermissionCustom(PermissionCustom permissionCustom) {
        this.permissionCustom = permissionCustom;
    }
}
