/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.*;
import model.User;
import observerpattern.IObserver;
import view.MainPanel;

/**
 *
 * @author santa
 */
public class Presenter implements IObserver {
    private final JFrame frame;
    private final MainPanel mainPanel;
    
    public Presenter()
    {
        frame = new JFrame();
        mainPanel = new MainPanel();
    }
    
    public void SetUpGUI()
    {
        mainPanel.addListener(this);
        frame.setSize(530, 305);
        frame.add(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void Update(String eventName) {
        switch (eventName)
        {
            case "newUser" -> {
                System.out.println("New");
            }
            case "close" -> {
                System.out.println("Close");
            }
            case "search" -> {
                System.out.println("Search");
            }
            case "visualize" -> {
            }
            default -> {
            }
        }
    }
    
}
