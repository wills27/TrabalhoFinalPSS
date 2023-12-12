/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command;

import presenter.MainWindowPresenter;
import service.LoginService;


/**
 *
 * @author santa
 */
public class LoginCommand extends BaseCommand{
    private LoginService loginService;
    private String username;
    private String password;
    
    public LoginCommand(MainWindowPresenter mainWindowPresenter) 
    {
        super(mainWindowPresenter);
        loginService = new LoginService();
    }

    @Override
    public void Execute() {
        if (loginService.authenticateLogin(username, password))
        {
            mainWindowPresenter.openUserView();
            mainWindowPresenter.closeLoginView();
        }
    }
    public void setUsername(String text)
    {
        username = text;
    }
    
    public void setPassword(String text)
    {
        password = text;
    }
}
