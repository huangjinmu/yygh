package com.jim.yygh.entity.vo;

import com.jim.yygh.entity.po.Ksxx;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jim on 2017/3/23.
 */
public class KsxxCustom extends Ksxx {


    private List<KsxxCustom> childrenKsxxCustom;


    public List<KsxxCustom> getChildrenKsxxCustom() {
        return childrenKsxxCustom;
    }

    public void setChildrenKsxxCustom(List<KsxxCustom> childrenKsxxCustom) {
        this.childrenKsxxCustom = childrenKsxxCustom;
    }
}
