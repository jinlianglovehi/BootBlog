package com.huadou.cn.plateform.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by jinliang on 16/10/17.
 */
@ApiModel
public class UserInfo implements Serializable {

    private String id ;
    @ApiModelProperty
    private String username ;
    @ApiModelProperty
    private String password ;
    private String telphone ;

    public UserInfo(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }
}
