package com.jim.yygh.entity.vo;

/**
 * Created by jim on 2017/3/30.
 */
public class YsxxQueryVo {
    //分页参数
    private PageQuery pageQuery;

    private  YsxxCustom ysxxCustom;

    public PageQuery getPageQuery() {
        return pageQuery;
    }

    public void setPageQuery(PageQuery pageQuery) {
        this.pageQuery = pageQuery;
    }

    public YsxxCustom getYsxxCustom() {
        return ysxxCustom;
    }

    public void setYsxxCustom(YsxxCustom ysxxCustom) {
        this.ysxxCustom = ysxxCustom;
    }
}
