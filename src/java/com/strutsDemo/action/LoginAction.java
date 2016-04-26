/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strutsDemo.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.strutsDemo.model.User;
import com.strutsDemo.service.LoginService;
import org.apache.commons.lang.StringUtils;

/**
 *
 * @author huico
 */
public class LoginAction extends ActionSupport implements ModelDriven {

    @Override
    public String execute() {
        LoginService service = new LoginService();

        if (service.verifyLogin(user)) {
            return SUCCESS;
        }
        return LOGIN;
    }

    //validate() auto called before execute()
    @Override
    public void validate() {
        super.validate();
        if (StringUtils.isEmpty(user.getUserId())) {
            //deal with user Id is blank
            addFieldError("userId", "User ID cannot be blank");
        }
        if (StringUtils.isEmpty(user.getPassword())) {
            //deal with password is blank
            addFieldError("password", "Password cannot be blank");
        }
    }

    @Override
    public Object getModel() {
        if (user == null) {
            user = new User();
        }
        return user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private User user;

}
