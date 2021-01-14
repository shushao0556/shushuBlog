package com.evshou.entity;

import java.util.Date;

public class BlogUsers {
    private Long id;

    private String username;

    private String password;

    private String rolename;

    private String sex;

    private String email;

    private String mobile;

    private Date registered;

    private Integer status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Date getRegistered() {
        return registered;
    }

    public void setRegistered(Date registered) {
        this.registered = registered;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public BlogUsers(String username, String password, String rolename, String sex, String email, String mobile, Date registered, Integer status) {
        this.username = username;
        this.password = password;
        this.rolename = rolename;
        this.sex = sex;
        this.email = email;
        this.mobile = mobile;
        this.registered = registered;
        this.status = status;
    }

    @Override
    public String toString() {
        return "BlogUsers{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", rolename='" + rolename + '\'' +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", registered=" + registered +
                ", status=" + status +
                '}';
    }

    public BlogUsers(Long id, String username, String password, String rolename, String sex, String email, String mobile, Date registered, Integer status) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.rolename = rolename;
        this.sex = sex;
        this.email = email;
        this.mobile = mobile;
        this.registered = registered;
        this.status = status;
    }

    public BlogUsers() {
    }
}