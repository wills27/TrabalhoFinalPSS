/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presenter;

import service.AuthenticationService;
import view.MainWindowView;

/**
 *
 * @author santa
 */
public final class MainWindowPresenter {
    private MainWindowView view;
    private final SearchPresenter searchPresenter;
    private final LoginPresenter loginPresenter;
    private final UserPresenter userPresenter;
    private final ChangePasswordPresenter changePasswordPresenter;
    
    public MainWindowPresenter(AuthenticationService authentication)
    {
        view = new MainWindowView();
        
        searchPresenter = new SearchPresenter();
        loginPresenter = new LoginPresenter(this, authentication);
        userPresenter = new UserPresenter(this);
        changePasswordPresenter = new ChangePasswordPresenter(this);
        
        view.addToPane(searchPresenter.getFrame());
        view.addToPane(loginPresenter.getFrame());
        view.addToPane(userPresenter.getFrame());
        view.addToPane(changePasswordPresenter.getFrame());
        
        openLoginView();
    }
    
    public void openSearchView()
    {
        searchPresenter.SetUpGUI();
    }
    
    public void openLoginView()
    {
        loginPresenter.SetUpGUI();
    }
    
    public void openUserView()
    {
        userPresenter.SetUpGUI();
    }
    
    public void openChangePasswordView()
    {
        changePasswordPresenter.SetUpGUI();
    }
}