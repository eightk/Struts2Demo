/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strutsDemo.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang.StringUtils;

/**
 *
 * @author huico
 */
public class LoginAction extends ActionSupport {

    @Override
    public String execute() {        
        if (getUserId() != null && getPassword() != null && getUserId().equals("test") && getPassword().equals("test")) {
            return SUCCESS;
        }
        return LOGIN;
    }

    //validate() auto called before execute()
    @Override
    public void validate() {
        super.validate(); 
        if(StringUtils.isEmpty(getUserId())) {
            //deal with user Id is blank
            addFieldError("userId", "User ID cannot be blank");
        }
        if(StringUtils.isEmpty(getPassword())) {
            //deal with password is blank
            addFieldError("password", "Password cannot be blank");
        }
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String userId;
    private String password;
}
