package com.pengtu.model;

import java.util.Date;

public class User {
    private String id;

    private String name;

    private String orgname;

    private String orgid;

    private String photo;

    private Integer age;

    private String sex;

    private String dutyname;

    private String username;

    private String password;

    private String email;

    private String mobilephone;

    private Date latestlogintime;

    private String onlinetype;

    private String expired;

    private String locked;

    private String credexpired;

    private String enable;

    private Date lastlogintime;

    private Integer attempts;

    private Date lastchangepwdtime;

    private String remark;

    private String delflag;

    private Date createdate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname == null ? null : orgname.trim();
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getDutyname() {
        return dutyname;
    }

    public void setDutyname(String dutyname) {
        this.dutyname = dutyname == null ? null : dutyname.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone == null ? null : mobilephone.trim();
    }

    public Date getLatestlogintime() {
        return latestlogintime;
    }

    public void setLatestlogintime(Date latestlogintime) {
        this.latestlogintime = latestlogintime;
    }

    public String getOnlinetype() {
        return onlinetype;
    }

    public void setOnlinetype(String onlinetype) {
        this.onlinetype = onlinetype == null ? null : onlinetype.trim();
    }

    public String getExpired() {
        return expired;
    }

    public void setExpired(String expired) {
        this.expired = expired == null ? null : expired.trim();
    }

    public String getLocked() {
        return locked;
    }

    public void setLocked(String locked) {
        this.locked = locked == null ? null : locked.trim();
    }

    public String getCredexpired() {
        return credexpired;
    }

    public void setCredexpired(String credexpired) {
        this.credexpired = credexpired == null ? null : credexpired.trim();
    }

    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable == null ? null : enable.trim();
    }

    public Date getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    public Integer getAttempts() {
        return attempts;
    }

    public void setAttempts(Integer attempts) {
        this.attempts = attempts;
    }

    public Date getLastchangepwdtime() {
        return lastchangepwdtime;
    }

    public void setLastchangepwdtime(Date lastchangepwdtime) {
        this.lastchangepwdtime = lastchangepwdtime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getDelflag() {
        return delflag;
    }

    public void setDelflag(String delflag) {
        this.delflag = delflag == null ? null : delflag.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}