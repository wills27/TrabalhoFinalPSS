/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command;

import dao.CSVLogDao;
import dao.UserDaoSqlite;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import model.User;
import presenter.MainWindowPresenter;
import service.LoginService;
import state.LoggedState;


/**
 *
 * @author santa
 */
public class LoginCommand extends BaseCommand{
    private UserDaoSqlite userDaoSqlite;
    private LoginService loginService;
    private CSVLogDao logDao;
    private String username;
    private String password;
    
    public LoginCommand(MainWindowPresenter mainWindowPresenter) 
    {
        super(mainWindowPresenter);
        loginService = new LoginService();
        userDaoSqlite = new UserDaoSqlite();
        logDao = new CSVLogDao();
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
                try {
                    logDao.saveLog("LoginEfetuado", username, getTime());
                }
                catch (IOException e){
                    
                }
            }
            else
            {
                mainWindowPresenter.openUserView();
                try {
                    logDao.saveLog("LoginEfetuado", username, getTime());
                }
                catch (IOException e){
                    
                }
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
    
    public String getTime()
    {
        LocalTime horaAtual = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaFormatada = horaAtual.format(formatter);
        return horaFormatada;
    }
}
