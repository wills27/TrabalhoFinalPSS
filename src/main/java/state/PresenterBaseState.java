/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package state;

import presenter.MainWindowPresenter;

/**
 *
 * @author santa
 */
public abstract class PresenterBaseState {
    protected MainWindowPresenter mainPresenter;
    
    public void performLogin(String username, String password)
    {
        throw new RuntimeException("Não possui essa funcionalidade");
    }
    public void solicitatePasswordChange()
    {
        throw new RuntimeException("Não possui essa funcionalidade");
    }
    public void register(String username, String password)
    {
        throw new RuntimeException("Não possui essa funcionalidade");
    }
}
