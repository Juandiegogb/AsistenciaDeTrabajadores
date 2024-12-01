/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import javax.swing.JOptionPane;
import org.json.JSONObject;
import services.UserServices;

/**
 *
 * @author Guest
 */
public class LoginPageController {

    public String Login(String username, String password) {

        username = username.trim();
        password = password.trim();

        if (username.length() <= 0 || password.length() <= 0) {
            JOptionPane.showMessageDialog(null, "Incomplete form", "Login failed", 0);
            return null;
        } else {
            UserServices userServices = new UserServices();
            JSONObject data = userServices.Login(username, password);
            System.out.println(data.toString());
            return null;

        }

    }

}
