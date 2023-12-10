/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import observerpattern.IObserver;
import observerpattern.Observed;

/**
 *
 * @author santa
 */
public class CustomPanel extends javax.swing.JPanel{
    protected final Observed observed;
    
    public CustomPanel()
    {
        observed = new Observed();
    }
    
    public void addListener(IObserver listener)
    {
        observed.AddListener(listener);
    }
}
