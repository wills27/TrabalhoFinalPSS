/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.UserDaoSqlite;
import java.util.List;
import model.User;

/**
 *
 * @author santa
 */
public class LoginService {
    private AuthenticationServiceAdapter authentication;
    private UserDaoSqlite userDaoSqlite;
    
    public LoginService()
    {
        userDaoSqlite = new UserDaoSqlite();
        authentication = new AuthenticationServiceAdapter();
    }
    
    public boolean authenticateLogin(String username, String password)
    {
        List<User> users = userDaoSqlite.listarTodos();
        
        for (var user: users) 
        {
           if (user.getUsername().equals(username))
           {
               return user.getPassword().equals(password);
           }
        }
        
        return false;
    }
    
    public boolean authenticateRegister(String username, String password)
    {
        List<User> users = userDaoSqlite.listarTodos();
        
        for (var user: users) 
        {
           if (user.getUsername().equals(username))
           {
               return false;
           }
           
        }
        
        userDaoSqlite.inserir(new User(username, password));
        
        return authentication.authenticate(username, password);
    }
}
