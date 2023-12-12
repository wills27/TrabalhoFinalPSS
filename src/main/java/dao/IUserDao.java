/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.User;
import java.util.List;

/**
 *
 * @author santa
 */
public interface IUserDao {
    void inserir(User user);
    
    User searchUserame(String username);
    
    List<User> listarTodos();
    
    void atualizar(User user);
    
    void deletar(int id);
}
