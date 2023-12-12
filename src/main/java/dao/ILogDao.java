/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.io.IOException;

/**
 *
 * @author santa
 */
public interface ILogDao {
    public  abstract  void saveLog(String operacao, String usuarioLogado, String usuarioManipulacao) throws IOException;
    public abstract void saveLogError(String operacao, String usuarioLogado, String usuarioManipulacao) throws IOException;
}
