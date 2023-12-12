/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author santa
 */
public class User {
    private int id;
    private String username;
    private String password;
    private String type;
    
    public User(String username, String password, String type)
    {
        this.username = username;
        this.password = password;
        this.type = type;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public String getUserType()
    {
        return type;
    }
}
