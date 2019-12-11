/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.liliacantalice;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author lilia
 */
public class BancoDados {
    public Statement statement;
    public ResultSet rs;
    private String driver = "org.postgresql.Driver";
    private String caminho = "jdbc:postgresql://localhost:5432/mercado";
    private String usuario = "postgres";
    private String senha = "280596";
    public Connection connect;
    
    public void conexaoBanco(){
        try {
            System.setProperty("jdbc.Drivers", driver);
            connect = DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null, "Conectado ao banco de dados!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexão!\nErro: " + ex.getMessage());
        }
    }
    
    public void executaSQL(String sql){
        try {
            statement= connect.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = statement.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na exclusão!\nErro: " + ex.getMessage());
        }
    }
    
    public void desconexaoBanco(){
        try {
            connect.close();
            //JOptionPane.showMessageDialog(null, "Desconectado do banco de dados!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao encerrar conexão!\nErro: " + ex.getMessage());
        }
    }
}
