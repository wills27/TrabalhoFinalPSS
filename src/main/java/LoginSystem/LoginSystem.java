package loginsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginSystem {
    private JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginSystem() {
        frame = new JFrame("Login System");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 2));

        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performLogin();
            }
        });

        frame.add(usernameLabel);
        frame.add(usernameField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(loginButton);

        frame.setVisible(true);
    }

    private void performLogin() {
        String username = usernameField.getText();
        char[] password = passwordField.getPassword();
        // Adicione lógica de verificação de login aqui

        // Exemplo simples: se o usuário for "admin" e a senha for "admin", considere como login bem-sucedido
        if ("admin".equals(username) && "admin".equals(new String(password))) {
            JOptionPane.showMessageDialog(frame, "Login Successful!");
        } else {
            JOptionPane.showMessageDialog(frame, "Login Failed!");
        }
    }
}