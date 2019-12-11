/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.liliacantalice;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author lilia
 */
public class ControleVenda {
    int codigoProd;
    BancoDados conexao = new BancoDados();
    
    //Adiciona itens ao carrinho de compras
    public void adicionaItem(ModeloVenda modelo){
        encontraCodigo(modelo.getNomeProduto());
        conexao.conexaoBanco();
        try {
            PreparedStatement pst = conexao.connect.prepareStatement("insert into itens_venda_produto(id_venda,id_produto,qtd_produto)values(?,?,?)");
            pst.setInt(1, modelo.getIdVenda());
            pst.setInt(2, codigoProd);
            pst.setInt(3, modelo.getQtdItem());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Produto adicionado com sucesso!");
            conexao.desconexaoBanco();
        } catch (SQLException ex) {
            conexao.desconexaoBanco();
            JOptionPane.showMessageDialog(null,"Erro ao realizar a venda!\n"+ ex);
        }
    }
    //Encontra o produto pelo código conectando a produtos mercado e armazenando o valor de id_produto em codigoProd
    public void encontraCodigo(String nomeProd){
        try {
            conexao.conexaoBanco();
            conexao.executaSQL("select * from produtos_mercado where nome_produto='"+nomeProd+"'");            
            conexao.rs.first();
            codigoProd = conexao.rs.getInt("id_produto");
            conexao.desconexaoBanco();
        } catch (SQLException ex) {
            conexao.desconexaoBanco();
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void vendaFinal(ModeloVenda modelo){
        conexao.conexaoBanco();
        try {
            PreparedStatement pst = conexao.connect.prepareStatement("update venda_mercado set data_venda=?, valor_venda=? where id_venda=?");
            pst.setString(1,modelo.getData());
            pst.setDouble(2,modelo.getValorVenda());
            pst.setInt(3, modelo.getIdVenda());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Venda finalizada!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        conexao.desconexaoBanco();
    }
}
