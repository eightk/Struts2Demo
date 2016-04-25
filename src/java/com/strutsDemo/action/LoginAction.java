/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strutsDemo.action;

import com.opensymphony.xwork2.Action;

/**
 *
 * @author huico
 */
public class LoginAction implements Action {
    
    public String execute() {
        if(getUserId().equals("test") && getPassword().equals("test")) {
            return SUCCESS;
        }
        return LOGIN;
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
