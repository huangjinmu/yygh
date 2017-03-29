package com.jim.yygh.entity.vo;

/**
 * Created by jim on 2017/3/23.
 */

public class KsxxQueryVo {
    //分页参数
    private PageQuery pageQuery;
    //用户的查询条件
    private KsxxCustom ksxxCustom;

    public PageQuery getPageQuery() {
        return pageQuery;
    }

    public void setPageQuery(PageQuery pageQuery) {
        this.pageQuery = pageQuery;
    }

    public KsxxCustom getKsxxCustom() {
        return ksxxCustom;
    }

    public void setKsxxCustom(KsxxCustom ksxxCustom) {
        this.ksxxCustom = ksxxCustom;
    }
}
