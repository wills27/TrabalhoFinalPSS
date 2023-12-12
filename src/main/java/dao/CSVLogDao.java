/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.opencsv.CSVWriter;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author santa
 */
public class CSVLogDao implements ILogDao {

    @Override
    public void saveLog(String operacao, String usuarioLogado, String usuarioManipulacao) throws IOException{

        String[] str = {operacao , usuarioLogado , usuarioManipulacao};

        try (Writer writer = Files.newBufferedWriter(Paths.get("pessoas.csv"))) {
            CSVWriter csvWriter = new CSVWriter(writer);
            
            csvWriter.writeNext(str);
            
            csvWriter.flush();
        }
    }

    @Override
    public void saveLogError(String operacao, String usuarioLogado, String usuarioManipulacao) {
        
    }
    
}
