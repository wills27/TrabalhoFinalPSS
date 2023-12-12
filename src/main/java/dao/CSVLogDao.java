/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.opencsv.CSVWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;

import java.io.IOException;

public class CSVLogDao implements ILogDao {

    @Override
    public void saveLog(String operacao, String usuarioLogado, String horario) throws IOException {
        String caminhoArquivo = "pessoas.csv";
        String[] str = {operacao, usuarioLogado, horario};

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo, true));
             CSVWriter csvWriter = new CSVWriter(writer)) {

            csvWriter.writeNext(str);

            System.out.println("Log adicionado com sucesso ao arquivo CSV.");
        }
    }

    @Override
    public void saveLogError (String operacao, String usuarioLogado, String horario) throws IOException {
        String caminhoArquivo = "pessoas.csv";
        String[] str = {operacao, usuarioLogado, horario};

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo, true));
             CSVWriter csvWriter = new CSVWriter(writer)) {

            csvWriter.writeNext(str);

            System.out.println("Log adicionado com sucesso ao arquivo CSV.");
        }
    }
    
}
