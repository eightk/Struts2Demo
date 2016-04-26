/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strutsDemo.service;

import com.strutsDemo.model.User;

/**
 *
 * @author huico
 */
public class LoginService {
    public boolean verifyLogin(User user) {
        if (user != null && user.getUserId() != null && user.getPassword() != null && user.getUserId().equals("test") && user.getPassword().equals("test")) {
            return true;
        }
        return false;
    }
    
}
