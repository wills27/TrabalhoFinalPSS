/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.*;
import javax.swing.*;
import model.User;
import observerpattern.IObserver;

/**
 *
 * @author santa
 */
public class Presenter implements IObserver {
    private final JFrame frame;
    private final MainPanel mainPanel;
    private final InclusionPanel inclusionPanel;
    
    public Presenter()
    {
        frame = new JFrame();
        mainPanel = new MainPanel();
        inclusionPanel = new InclusionPanel();
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
                openDialog(inclusionPanel, 500, 300).setVisible(true);
                System.out.println("New");
            }
            case "close" -> {
                JOptionPane.showMessageDialog(frame, "Login Successful!");
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
    
    private  JDialog openDialog(JPanel panel, int width, int height){
      final JDialog modelDialog = new JDialog(frame, 
         Dialog.ModalityType.DOCUMENT_MODAL);
      modelDialog.setBounds(132, 132, width, height);
      Container dialogContainer = modelDialog.getContentPane();
      dialogContainer.setLayout(new BorderLayout());  

      dialogContainer.add(panel, BorderLayout.SOUTH);

      return modelDialog;
   }
    
}
