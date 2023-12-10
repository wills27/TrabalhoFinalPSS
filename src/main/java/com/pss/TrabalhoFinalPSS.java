/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pss;

import loginsystem.LoginSystem;
import view.MainWindow;
import view.SearchPresenter;

/**
 *
 * @author santa
 */
public class TrabalhoFinalPSS extends javax.swing.JFrame {

    public static void main(String args[]) {
        SearchPresenter presenter = new SearchPresenter();
        presenter.SetUpGUI();
        MainWindow mainwindow = new MainWindow();
        mainwindow.addToPane(presenter.getFrame());
//        LoginSystem login = new LoginSystem();
    }
}
