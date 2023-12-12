/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command;

import dao.UserDaoSqlite;
import java.util.List;
import model.User;
import presenter.MainWindowPresenter;
import service.LoginService;


/**
 *
 * @author santa
 */
public class LoginCommand extends BaseCommand{
    private UserDaoSqlite userDaoSqlite;
    private LoginService loginService;
    private String username;
    private String password;
    
    public LoginCommand(MainWindowPresenter mainWindowPresenter) 
    {
        super(mainWindowPresenter);
        loginService = new LoginService();
        userDaoSqlite = new UserDaoSqlite();
        
    }

    @Override
    public void Execute() {
        List<User> users = userDaoSqlite.listarTodos();
        if (loginService.authenticateLogin(username, password, users))
        {
            User user = userDaoSqlite.searchUserame(username);
            if (user.getUserType().equals("admin"))
            {
                mainWindowPresenter.openAdminView();
            }
            else
            {
                mainWindowPresenter.openUserView();
            }
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
