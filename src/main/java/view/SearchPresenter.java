/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 *
 * @author santa
 */
public class SearchPresenter {
    private final Search search;
    
    public SearchPresenter()
    {
        search = new Search();

    }
    
    public void SetUpGUI()
    {
        search.setVisible(true);
        
        configureScreen();
    }
    
    private void configureScreen()
    {
        search.getBuscarButton().addActionListener((ActionEvent e) -> {
            buscar();
        });
        
        search.getVisualizeButton().addActionListener((ActionEvent e) -> {
            visualize();
        });
        
        search.getNewButton().addActionListener((ActionEvent e) -> {
            newUser();
        });
    }
    
    private void newUser()
    {
        
    }
    
    private void visualize()
    {
        
    }
    
    private void buscar()
    {
        System.out.println("Buscar");
    }
    
    public JInternalFrame getFrame()
    {
        return search;
    }
    
}
