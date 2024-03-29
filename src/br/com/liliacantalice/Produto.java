/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.liliacantalice;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;


/**
 *
 * @author lilia
 */
public class Produto extends javax.swing.JFrame {
    BancoDados conexao = new BancoDados();
    /**
     * Creates new form CriarProduto
     */
    public Produto() {
        initComponents();
        conexao.conexaoBanco();
        preencherTabela("select * from produtos_mercado order by id_produto");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        descricao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        valorVenda = new javax.swing.JTextField();
        valorCompra = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelinda = new javax.swing.JTable();
        retorno = new javax.swing.JButton();
        cadastrarProduto = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        novo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrador de Vendas");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel2.setText("Nome do Produto:");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel3.setText("Valor da Compra:");

        descricao.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel4.setText("Valor da Venda:");

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 13)); // NOI18N
        jLabel1.setText("  R$");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 13)); // NOI18N
        jLabel7.setText("  R$");

        codigo.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel8.setText("Código:");

        valorVenda.setEnabled(false);

        valorCompra.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7)))
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(codigo)
                    .addComponent(descricao, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(valorVenda)
                    .addComponent(valorCompra))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(valorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(valorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(191, Short.MAX_VALUE))
        );

        tabelinda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabelinda);

        retorno.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 13)); // NOI18N
        retorno.setText("Retornar ao Menu");
        retorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retornoActionPerformed(evt);
            }
        });

        cadastrarProduto.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 13)); // NOI18N
        cadastrarProduto.setText("Cadastrar Produto");
        cadastrarProduto.setEnabled(false);
        cadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarProdutoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel5.setText("Relação de Produtos");

        novo.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 13)); // NOI18N
        novo.setText("Nova Entrada");
        novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(novo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(187, 187, 187))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(cadastrarProduto)
                        .addGap(39, 39, 39)
                        .addComponent(retorno, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cadastrarProduto, retorno});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(retorno, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(novo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void retornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retornoActionPerformed
        MenuUI menu = new MenuUI();
        this.hide();
        menu.setVisible(true);
    }//GEN-LAST:event_retornoActionPerformed

    private void cadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarProdutoActionPerformed
        try {
            PreparedStatement pst = conexao.connect.prepareStatement("insert into produtos_mercado (id_produto,nome_produto,valor_compra,valor_venda)values(?,?,?,?)");
            try{
                pst.setInt(1, Integer.parseInt(codigo.getText()));
                pst.setString(2, descricao.getText());
                pst.setDouble(3, Double.parseDouble(valorCompra.getText()));
                pst.setDouble(4, Double.parseDouble(valorVenda.getText()));
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(rootPane, "Erro no Cadastro! Formatação errada!\n\n"+ex);
            }
            if(codigo.getText().equals("") || descricao.getText().equals("") || valorCompra.getText().equals("") || valorVenda.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Erro! Nenhum dos campos pode estar vazio!");
            }else{
                if(Double.parseDouble(valorCompra.getText()) >= Double.parseDouble(valorVenda.getText())){
                    JOptionPane.showMessageDialog(rootPane, "Erro! O valor da compra não pode ser maior que o valor da venda!");
                }else{
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(rootPane, "Produto salvo com Sucesso!");
                    preencherTabela("select * from produtos_mercado order by id_produto");                 
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro no Cadastro!\n\nERRO: "+ex);
        }
        codigo.setText("");
        descricao.setText("");
        valorCompra.setText("");
        valorVenda.setText("");
        
        codigo.setEnabled(false);
        descricao.setEnabled(false);
        valorCompra.setEnabled(false);
        valorVenda.setEnabled(false);
        
        cadastrarProduto.setEnabled(false);
        novo.setEnabled(true);
    }//GEN-LAST:event_cadastrarProdutoActionPerformed

    private void novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoActionPerformed
        codigo.setText("");
        descricao.setText("");
        valorCompra.setText("");
        valorVenda.setText("");
        
        codigo.setEnabled(true);
        descricao.setEnabled(true);
        valorCompra.setEnabled(true);
        valorVenda.setEnabled(true);
        
        cadastrarProduto.setEnabled(true);
        novo.setEnabled(false);
    }//GEN-LAST:event_novoActionPerformed
    
    public void preencherTabela(String sql){
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"Código","Nome","Valor da Compra","Valor da Venda"};        

        conexao.executaSQL(sql);            
        try {
            conexao.rs.first();
            do{
                dados.add(new Object[]{conexao.rs.getInt("id_produto"), conexao.rs.getString("nome_produto"), conexao.rs.getDouble("valor_compra"), conexao.rs.getDouble("valor_venda")});
            }while(conexao.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher o ArrayList!\nErro: "+ex);
        }
        
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        tabelinda.setModel(modelo);
        //Código
        tabelinda.getColumnModel().getColumn(0).setPreferredWidth(99); //Tamanho
        tabelinda.getColumnModel().getColumn(0).setResizable(false); //Não pode aumentar o tamanho com o mouse
        //Nome
        tabelinda.getColumnModel().getColumn(1).setPreferredWidth(169); //Tamanho
        tabelinda.getColumnModel().getColumn(1).setResizable(false); //Não pode aumentar o tamanho com o mouse
        //Valor Compra
        tabelinda.getColumnModel().getColumn(2).setPreferredWidth(150); //Tamanho
        tabelinda.getColumnModel().getColumn(2).setResizable(false); //Não pode aumentar o tamanho com o mouse
        //Valor Venda
        tabelinda.getColumnModel().getColumn(3).setPreferredWidth(150); //Tamanho
        tabelinda.getColumnModel().getColumn(3).setResizable(false); //Não pode aumentar o tamanho com o mouse
        //Cabeçalho da tabela
        tabelinda.getTableHeader().setReorderingAllowed(false);//Não pode reordenar a posição
        tabelinda.setAutoResizeMode(tabelinda.AUTO_RESIZE_OFF); //Não pode ser redimensionada
        tabelinda.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   
    }
    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Produto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarProduto;
    private javax.swing.JTextField codigo;
    private javax.swing.JTextField descricao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton novo;
    private javax.swing.JButton retorno;
    private javax.swing.JTable tabelinda;
    private javax.swing.JTextField valorCompra;
    private javax.swing.JTextField valorVenda;
    // End of variables declaration//GEN-END:variables
}
