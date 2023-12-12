/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pss;

import presenter.MainWindowPresenter;
import service.AuthenticationServiceAdapter;
/**
 *
 * @author santa
 */
public class TrabalhoFinalPSS extends javax.swing.JFrame {

    public static void main(String args[]) {
        MainWindowPresenter mainWindowPresenter = new MainWindowPresenter(new AuthenticationServiceAdapter());
        
    }
}
