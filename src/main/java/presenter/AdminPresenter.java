/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presenter;

import java.awt.event.ActionEvent;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import view.*;

/**
 *
 * @author santa
 */
public class AdminPresenter {
    private AdminView view;
    private MainWindowPresenter mainWindowPresenter;
    
    public AdminPresenter(MainWindowPresenter mainWindowPresenter)
    {
        this.mainWindowPresenter = mainWindowPresenter;
        view = new AdminView();
        configureScreen();
    }
    
    public void SetUpGUI()
    {
        view.setVisible(true);
        view.setLocation(10, 10);
    }
    
    private void configureScreen()
    {
//        view.getSolicitationButton().addActionListener((ActionEvent e) -> {
//            solicitatePasswordChange();
//        });
    }
    
    private void solicitatePasswordChange()
    {
        JOptionPane.showMessageDialog(view, "Solicitação confirmada!", "Confirmado", JOptionPane.INFORMATION_MESSAGE);
        view.setVisible(false);
    }
    
    public JInternalFrame getFrame()
    {
        return view;
    }
}
