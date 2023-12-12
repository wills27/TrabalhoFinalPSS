/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import com.pss.senha.validacao.ValidadorSenha;

/**
 *
 * @author santa
 */
public class AuthenticationServiceAdapter{
    private ValidadorSenha passwordValidator;
    
    public AuthenticationServiceAdapter()
    {
        this.passwordValidator = new ValidadorSenha();
    }
    
    public boolean authenticate(String username, String password)
    {
        this.passwordValidator.validar(username);
        this.passwordValidator.validar(password);
        return true;
    }
    
    
    
}
