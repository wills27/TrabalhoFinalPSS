/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presenter;

import java.awt.event.ActionEvent;
import javax.swing.*;
import service.AuthenticationService;
import view.LoginView;

/**
 *
 * @author santa
 */
public class LoginPresenter{
    private final LoginView view;
    private MainWindowPresenter mainWindowPresenter;
    private AuthenticationService authentication;
    
    public LoginPresenter(MainWindowPresenter mainWindowPresenter, AuthenticationService authentication)
    {
        view = new LoginView();
        this.authentication = authentication;
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
    
    private void performLogin()
    {
        System.out.println(view.getUsernameField().getText());
        System.out.println(view.getPasswordField().getPassword());
        if (authentication.authenticate("", ""))
        {
            mainWindowPresenter.openUserView();
            view.setVisible(false);
        }
        
    }
    
    private void register()
    {
        
    }
    
    public JInternalFrame getFrame()
    {
        return view;
    }
}
