package com.jim.yygh.entity.vo;

/**
 * Created by jim on 2017/4/10.
 */
public class SysRoleQueryVo {
    private SysRoleCustom sysRoleCustom;
    private PageQuery pageQuery;

    public SysRoleCustom getSysRoleCustom() {
        return sysRoleCustom;
    }

    public void setSysRoleCustom(SysRoleCustom sysRoleCustom) {
        this.sysRoleCustom = sysRoleCustom;
    }

    public PageQuery getPageQuery() {
        return pageQuery;
    }

    public void setPageQuery(PageQuery pageQuery) {
        this.pageQuery = pageQuery;
    }
}
