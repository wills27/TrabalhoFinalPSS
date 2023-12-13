/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.User;
import java.util.List;

/**
 *
 * @author santa
 */
public class UserDaoSqlite implements IUserDao {

    private Connection connection;
    
    public UserDaoSqlite()
    {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:db/test.db");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    @Override
    public User searchUserame(String username) {
        String sql = "SELECT id, username, password, usertype FROM users";
        
        try (
            Statement stmt  = connection.createStatement();
            ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            while (rs.next()) {
                if (rs.getString("username").equals(username)){
                    return new User(rs.getString("username"),
                            rs.getString("password"),
                            rs.getString("usertype"));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    @Override
    public void inserir(User user) {
        String sql = "INSERT INTO users(username, password, usertype) VALUES(?,?,?)";

        try (
            PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, user.getUsername());
            pstmt.setString(2, user.getPassword());
            pstmt.setString(3, user.getUserType());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<User> listarTodos() {
        List<User> users = new ArrayList<>();

        String sql = "SELECT id, username, password, usertype FROM users";
        
        try (
            Statement stmt  = connection.createStatement();
            ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            while (rs.next()) {

                users.add(new User(rs.getString("username")
                        ,rs.getString("password"), 
                        rs.getString("usertype")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return users;
    }

    @Override
    public void atualizar(User user) 
    {
        String sql = "UPDATE users SET username = ? , "
                + "password = ? "
                + "WHERE id = ?";

        try (
            PreparedStatement pstmt = connection.prepareStatement(sql)) {

            // set the corresponding param
            pstmt.setString(1, user.getUsername());
            pstmt.setString(2, user.getPassword());
            pstmt.setInt(3, user.getId());
            // update 
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void deletar(int id) {
        String sql = "DELETE FROM users WHERE id = ?";

        try (
            PreparedStatement pstmt = connection.prepareStatement(sql)) {

            // set the corresponding param
            pstmt.setInt(1, id);
            // execute the delete statement
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    
    
}
