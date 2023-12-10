/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pss;

import javax.swing.*;
import java.awt.*;

public class GUIDemo {
    private JFrame frame;
    private JPanel panel;
    private JButton button1;
    private JButton button2;
    private int width;
    private int height;
    
    public GUIDemo(int w, int h)
    {
        frame = new JFrame();
        panel = new JPanel(new GridLayout(1,2));
        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");
        width = w;
        height = h;
    }
    
    public void SetUpGUI()
    {
        frame.setSize(width, height);
        frame.setTitle("GUI Demo");
        panel.add(button1);
        panel.add(button2);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
