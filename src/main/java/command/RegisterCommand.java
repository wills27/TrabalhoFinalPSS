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
import state.LoggedState;

/**
 *
 * @author santa
 */
 
public class RegisterCommand extends BaseCommand{
    private UserDaoSqlite userDaoSqlite;
    private LoginService loginService;
    private String username;
    private String password;
    
    public RegisterCommand(MainWindowPresenter mainWindowPresenter) 
    {
        
        super(mainWindowPresenter);
        loginService = new LoginService();
        userDaoSqlite = new UserDaoSqlite();
    }

    @Override
    public void Execute() {
        String userType;
        List<User> users = userDaoSqlite.listarTodos();
        if (loginService.authenticateRegister(username, password, users))
        {
            if (userDaoSqlite.listarTodos().isEmpty()){
                userDaoSqlite.inserir(new User(username, password, "admin"));
                mainWindowPresenter.openAdminView();

            }
            else{
                userDaoSqlite.inserir(new User(username, password, "user"));
                mainWindowPresenter.openUserView();

            }
            mainWindowPresenter.SetState(new LoggedState());
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
