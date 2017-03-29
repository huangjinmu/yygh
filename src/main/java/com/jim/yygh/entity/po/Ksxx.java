package com.jim.yygh.entity.po;

import java.util.Date;

public class Ksxx {
    private Integer id;

    private String ksName;

    private String ksjj;

    private String sfsc;

    private String ksjs;

    private Date addtime;

    private Integer pid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKsName() {
        return ksName;
    }

    public void setKsName(String ksName) {
        this.ksName = ksName == null ? null : ksName.trim();
    }

    public String getKsjj() {
        return ksjj;
    }

    public void setKsjj(String ksjj) {
        this.ksjj = ksjj == null ? null : ksjj.trim();
    }

    public String getSfsc() {
        return sfsc;
    }

    public void setSfsc(String sfsc) {
        this.sfsc = sfsc == null ? null : sfsc.trim();
    }

    public String getKsjs() {
        return ksjs;
    }

    public void setKsjs(String ksjs) {
        this.ksjs = ksjs == null ? null : ksjs.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}