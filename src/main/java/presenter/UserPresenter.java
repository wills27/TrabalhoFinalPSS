/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presenter;

import java.awt.event.ActionEvent;
import javax.swing.JInternalFrame;
import view.UserView;

/**
 *
 * @author santa
 */
public class UserPresenter {
    
    private UserView view;
    private MainWindowPresenter mainWindowPresenter;
    
    public UserPresenter(MainWindowPresenter mainWindowPresenter)
    {
        view = new UserView();
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
        view.getChangePassButton().addActionListener((ActionEvent e) -> {
            changePassword();
        });
        view.getNotificationsButton().addActionListener((ActionEvent e) -> {
            openNotifications();
        });
    }
    
    
    
    private void changePassword()
    {
        mainWindowPresenter.openChangePasswordView();
    }
    
    private void openNotifications()
    {
        
    }
    
    public JInternalFrame getFrame()
    {
        return view;
    }
}
