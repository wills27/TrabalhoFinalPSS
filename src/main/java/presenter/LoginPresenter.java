/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presenter;

import java.awt.event.ActionEvent;
import java.util.Arrays;
import javax.swing.*;
import view.LoginView;


public class LoginPresenter{
    private final LoginView view;
    private MainWindowPresenter mainWindowPresenter;
    
    public LoginPresenter(MainWindowPresenter mainWindowPresenter)
    {
        view = new LoginView();
        this.mainWindowPresenter = mainWindowPresenter;
        configureScreen();

    }
    
    public void SetUpGUI()
    {
        view.setVisible(true);
        view.setLocation(10, 10);
    }
    
    private void configureScreen()
    {
        view.getLoginButton().addActionListener((ActionEvent e) -> {
            performLogin();
        });
        
        view.getRegisterButton().addActionListener((ActionEvent e) -> {
            register();
        });
    }
    
    public void performLogin()
    {
        mainWindowPresenter.getState().performLogin(getUsername(), getPassword());
    }
    
    private void register()
    {
        mainWindowPresenter.getState().register(getUsername(), getPassword());
    }
    
    public JInternalFrame getFrame()
    {
        return view;
    }
    
    public String getUsername()
    {
        System.out.println("name" + view.getUsernameField().getText());
        return view.getUsernameField().getText();
    }
    
    public String getPassword()
    {
        char[] password = view.getPasswordField().getPassword();
        String str = String.valueOf(password);
        return str;
    }
}
