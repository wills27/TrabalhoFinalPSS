/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import model.User;

/**
 *
 * @author santa
 */
public class LoginService {
    private AuthenticationServiceAdapter authentication;
    
    public LoginService()
    {
        authentication = new AuthenticationServiceAdapter();
    }
    
    public boolean authenticateLogin(String username, String password, List<User> users)
    {   
        for (var user: users) 
        {
           if (user.getUsername().equals(username))
           {
               return user.getPassword().equals(password);
           }
        }
        
        return false;
    }
    
    public boolean authenticateRegister(String username, String password, List<User> users)
    {        
        for (var user: users) 
        {
           if (user.getUsername().equals(username))
           {
               return false;
           }
           
        }
        return authentication.authenticate(username, password);
    }
}
