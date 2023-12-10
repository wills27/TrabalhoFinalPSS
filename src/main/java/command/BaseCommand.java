/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command;

import SystemManager.SystemManager;

/**
 *
 * @author santa
 */
public abstract class BaseCommand {
    
    protected SystemManager systemManager;
    
    public BaseCommand(SystemManager systemManager)
    {
        this.systemManager = systemManager;
    }
    
    public abstract void Execute();

}
