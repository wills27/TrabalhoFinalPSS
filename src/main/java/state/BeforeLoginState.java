/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state;

import command.LoginCommand;
import command.RegisterCommand;
import presenter.*;


public class BeforeLoginState extends PresenterBaseState{
    
    private LoginPresenter loginPresenter;
    LoginCommand loginCommand;
    RegisterCommand registerCommand;
    
    public BeforeLoginState(MainWindowPresenter mainPresenter, LoginPresenter loginPresenter)
    {
        this.mainPresenter = mainPresenter;
        loginCommand = new LoginCommand(mainPresenter);
        registerCommand = new RegisterCommand(mainPresenter);
    }
    
    @Override
    public void performLogin(String username, String password)
    {
        loginCommand.setUsername(username);
        loginCommand.setPassword(password);
        loginCommand.Execute();
    }
    
    @Override
    public void register(String username, String password)
    {
        registerCommand.setUsername(username);
        registerCommand.setPassword(password);
        registerCommand.Execute();
    }
    
}
