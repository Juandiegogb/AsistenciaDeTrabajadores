/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import services.UserServices;

/**
 *
 * @author Guest
 */
public class LoginPageController {

    public String Login(String username, String password) {
        UserServices userServices = new UserServices();
        String avatar = userServices.Login(username, password);
        return avatar;
    }

}
