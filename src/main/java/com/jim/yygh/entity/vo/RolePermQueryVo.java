package com.jim.yygh.entity.vo;

/**
 * Created by jim on 2017/4/10.
 */

public class RolePermQueryVo {
    //分页参数
    private PageQuery pageQuery;

    public  RolePermCustom rolePermCustom;

    public PageQuery getPageQuery() {
        return pageQuery;
    }

    public void setPageQuery(PageQuery pageQuery) {
        this.pageQuery = pageQuery;
    }

    public RolePermCustom getRolePermCustom() {
        return rolePermCustom;
    }

    public void setRolePermCustom(RolePermCustom rolePermCustom) {
        this.rolePermCustom = rolePermCustom;
    }
}
