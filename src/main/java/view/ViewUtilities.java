/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dialog;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author santa
 */
public class ViewUtilities {
    public static  JDialog openDialog(JFrame frame, JPanel panel, int width, int height){
      final JDialog modelDialog = new JDialog(frame, 
         Dialog.ModalityType.DOCUMENT_MODAL);
      modelDialog.setBounds(132, 132, width, height);
      Container dialogContainer = modelDialog.getContentPane();
      dialogContainer.setLayout(new BorderLayout());  

      dialogContainer.add(panel, BorderLayout.SOUTH);

      return modelDialog;
   }
}
