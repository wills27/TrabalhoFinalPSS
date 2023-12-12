/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presenter;

import dao.UserDaoSqlite;
import model.User;
import service.AuthenticationServiceAdapter;
import state.BeforeLoginState;
import state.PresenterBaseState;
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
    private final AdminPresenter adminPresenter;
    
    
    private PresenterBaseState state;
    
    private User loggedUser;
    
    public MainWindowPresenter(AuthenticationServiceAdapter authentication)
    {
        view = new MainWindowView();
        
        searchPresenter = new SearchPresenter();
        loginPresenter = new LoginPresenter(this);
        userPresenter = new UserPresenter(this);
        changePasswordPresenter = new ChangePasswordPresenter(this);
        adminPresenter = new AdminPresenter(this);
                
        view.addToPane(searchPresenter.getFrame());
        view.addToPane(loginPresenter.getFrame());
        view.addToPane(userPresenter.getFrame());
        view.addToPane(changePasswordPresenter.getFrame());
        view.addToPane(adminPresenter.getFrame());
        
        state = new BeforeLoginState(this, loginPresenter);
        
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
    
    public void openAdminView()
    {
        adminPresenter.SetUpGUI();
    }
    
    public void openChangePasswordView()
    {
        changePasswordPresenter.SetUpGUI();
    }
    
    public void closeLoginView()
    {
        loginPresenter.getFrame().dispose();
    }
    
    public PresenterBaseState getState()
    {
        return state;
    }
    
    public void SetState(PresenterBaseState state)
    {
        this.state = state;
    }
    
    public void SetLoggedUser(User user)
    {
        loggedUser = user;
    }
}
