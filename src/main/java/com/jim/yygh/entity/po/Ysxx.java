package com.jim.yygh.entity.po;

public class Ysxx {
    private String id;

    private String ysName;

    private String ysSex;

    private Integer ysAge;

    private String ysSummary;

    private String ysZc;

    private String ysPhoto;

    private Integer ksId;

    private String isdel;

    private String ysPhone;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getYsName() {
        return ysName;
    }

    public void setYsName(String ysName) {
        this.ysName = ysName == null ? null : ysName.trim();
    }

    public String getYsSex() {
        return ysSex;
    }

    public void setYsSex(String ysSex) {
        this.ysSex = ysSex == null ? null : ysSex.trim();
    }

    public Integer getYsAge() {
        return ysAge;
    }

    public void setYsAge(Integer ysAge) {
        this.ysAge = ysAge;
    }

    public String getYsSummary() {
        return ysSummary;
    }

    public void setYsSummary(String ysSummary) {
        this.ysSummary = ysSummary == null ? null : ysSummary.trim();
    }

    public String getYsZc() {
        return ysZc;
    }

    public void setYsZc(String ysZc) {
        this.ysZc = ysZc == null ? null : ysZc.trim();
    }

    public String getYsPhoto() {
        return ysPhoto;
    }

    public void setYsPhoto(String ysPhoto) {
        this.ysPhoto = ysPhoto == null ? null : ysPhoto.trim();
    }

    public Integer getKsId() {
        return ksId;
    }

    public void setKsId(Integer ksId) {
        this.ksId = ksId;
    }

    public String getIsdel() {
        return isdel;
    }

    public void setIsdel(String isdel) {
        this.isdel = isdel == null ? null : isdel.trim();
    }

    public String getYsPhone() {
        return ysPhone;
    }

    public void setYsPhone(String ysPhone) {
        this.ysPhone = ysPhone == null ? null : ysPhone.trim();
    }
}