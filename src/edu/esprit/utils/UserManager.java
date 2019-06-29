/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.utils;

import edu.esprit.models.User;

/**
 *
 * @author yjaballi
 */
public class UserManager {
     private static User user;
     private static User RegisterUser;
    private UserManager(){   
    }

    public static User getUser() {
        return user;
    }

    public static void setRegisterUser(User RegisterUser) {
        UserManager.RegisterUser = RegisterUser;
    }

    public static User getRegisterUser() {
        return RegisterUser;
    }

    public static void setUser(User user) {
        UserManager.user = user;
    }
    
}
