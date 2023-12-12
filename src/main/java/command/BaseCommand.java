/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command;

import presenter.MainWindowPresenter;


public abstract class BaseCommand {
    
    protected MainWindowPresenter mainWindowPresenter;
    
    public BaseCommand(MainWindowPresenter mainWindowPresenter)
    {
        this.mainWindowPresenter = mainWindowPresenter;
    }
    
    public abstract void Execute();
}
