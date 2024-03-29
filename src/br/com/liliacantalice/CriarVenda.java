/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.liliacantalice;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

//Exception in thread "AWT-EventQueue-0" java.lang.NullPointerException

/**
 *
 * @author lilia
 */
public class CriarVenda extends javax.swing.JFrame {
    ControleVenda controle = new ControleVenda();
    BancoDados conexao = new BancoDados();
    ModeloVenda modelo = new ModeloVenda();
    
    int flag = 1,codigoVenda;
    double totalCompra = 0.00;
    /**
     * Creates new form CriarVenda
     */
    public CriarVenda() {
        initComponents();
        
        //Máscara da data (dia/mês/ano)
        try{
            MaskFormatter form = new MaskFormatter("##/##/####");
            data.setFormatterFactory(new DefaultFormatterFactory(form));
        }catch(ParseException ex){
            JOptionPane.showMessageDialog(rootPane, ex);
        }
        //Pegando data atual do sistema
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date hoje = new Date();
        data.setText(df.format(hoje));
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
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nomeProduto = new javax.swing.JTextField();
        qtd = new javax.swing.JTextField();
        valorItem = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        valorTotal = new javax.swing.JTextField();
        data = new javax.swing.JFormattedTextField();
        buscarProduto = new javax.swing.JButton();
        addItem = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        retorno = new javax.swing.JButton();
        confirmarVenda = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelinda = new javax.swing.JTable();
        novo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelindaCompras = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrador de Vendas");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 13)); // NOI18N
        jLabel2.setText("Nome do Produto:");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 13)); // NOI18N
        jLabel3.setText("Data:");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 13)); // NOI18N
        jLabel4.setText("Quantidade:");

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 13)); // NOI18N
        jLabel6.setText("Valor por Item:");

        nomeProduto.setEnabled(false);

        qtd.setEnabled(false);
        qtd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                qtdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                qtdFocusLost(evt);
            }
        });

        valorItem.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 13)); // NOI18N
        jLabel7.setText("Valor Total:");

        valorTotal.setEnabled(false);

        data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        data.setEnabled(false);
        data.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dataFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dataFocusLost(evt);
            }
        });
        data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataActionPerformed(evt);
            }
        });

        buscarProduto.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 13)); // NOI18N
        buscarProduto.setText("Busca");
        buscarProduto.setEnabled(false);
        buscarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarProdutoActionPerformed(evt);
            }
        });

        addItem.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 13)); // NOI18N
        addItem.setText("Adicionar ao carrinho");
        addItem.setEnabled(false);
        addItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 13)); // NOI18N
        jLabel9.setText("R$");

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 13)); // NOI18N
        jLabel10.setText("R$");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(nomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(buscarProduto))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(addItem, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(qtd, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(valorItem, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarProduto)
                    .addComponent(jLabel9))
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addItem, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7))
                .addGap(49, 49, 49))
        );

        retorno.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 13)); // NOI18N
        retorno.setText("Retornar ao Menu");
        retorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retornoActionPerformed(evt);
            }
        });

        confirmarVenda.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 13)); // NOI18N
        confirmarVenda.setText("Confirmar Venda");
        confirmarVenda.setEnabled(false);
        confirmarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarVendaActionPerformed(evt);
            }
        });

        tabelinda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelinda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelindaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelinda);

        novo.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 13)); // NOI18N
        novo.setText("Nova Entrada");
        novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel1.setText("Lista de Produtos");

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel11.setText("Itens no Carrinho de Compras");

        tabelindaCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelindaCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelindaComprasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelindaCompras);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(399, 399, 399))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 919, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 919, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(novo, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(confirmarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(retorno, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(retorno, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(novo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {confirmarVenda, novo, retorno});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void retornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retornoActionPerformed
        MenuUI menu = new MenuUI();
        this.hide();
        menu.setVisible(true);
    }//GEN-LAST:event_retornoActionPerformed

    private void novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoActionPerformed
        nomeProduto.setEnabled(true);
        buscarProduto.setEnabled(true);
        
        novo.setEnabled(false);
    }//GEN-LAST:event_novoActionPerformed

    private void confirmarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarVendaActionPerformed
        modelo.setIdVenda(codigoVenda);
        modelo.setData(data.getText());
        modelo.setValorVenda(Double.parseDouble(valorTotal.getText()));
        controle.vendaFinal(modelo);
        dispose();
    }//GEN-LAST:event_confirmarVendaActionPerformed

    private void buscarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarProdutoActionPerformed
        flag = 1;
        conexao.conexaoBanco();
        try {
            //Começa a venda com o valor 0.00
            PreparedStatement pst = conexao.connect.prepareStatement("insert into venda_mercado (valor_venda)values(?)");
            pst.setDouble(1, 0.00);
            pst.execute();
            conexao.executaSQL("select * from venda_mercado");
            conexao.rs.last();
            codigoVenda = conexao.rs.getInt("id_venda");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
        preencherTabelaProdutosLista("select * from produtos_mercado where nome_produto like '%"+nomeProduto.getText()+"%'");
    }//GEN-LAST:event_buscarProdutoActionPerformed

    private void tabelindaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelindaMouseClicked
        qtd.setEnabled(true);
        addItem.setEnabled(true);

        //Seleciona o nome do produto, na coluna 2(1) (coluna dos nomes dos produtos)
        String nome_produto = "" + tabelinda.getValueAt(tabelinda.getSelectedRow(), 1);
        //nomeProduto.setText(nome_produto);
        conexao.conexaoBanco();
        conexao.executaSQL("select * from produtos_mercado where nome_produto='"+nome_produto+"'");
        try {
            //Insere os valores de acordo com o que foi clicado
            conexao.rs.first();
            nomeProduto.setText(conexao.rs.getString("nome_produto"));
            nomeProduto.setEnabled(false);
            buscarProduto.setEnabled(false);
            valorItem.setText(String.valueOf(conexao.rs.getDouble("valor_venda")));
            //Já inicia a venda com a quantidade de produtos igual a 1
            qtd.setText("1");
//            conexao.desconexaoBanco();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,ex);
        } 
    }//GEN-LAST:event_tabelindaMouseClicked

    private void qtdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_qtdFocusGained
        double valorFinal;
        valorFinal = Double.parseDouble(valorItem.getText()) * Integer.parseInt(qtd.getText());
        
        //O valor da compra total recebe o valor vezes a quantidade de itens 
        valorTotal.setText(String.valueOf(valorFinal));
    }//GEN-LAST:event_qtdFocusGained

    private void dataFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataFocusGained
//        double valorFinal;
//        valorFinal = Double.parseDouble(valorItem.getText()) * Integer.parseInt(qtd.getText());
//        
//        //O valor da compra total recebe o valor vezes a quantidade de itens 
//        valorTotal.setText(String.valueOf(valorFinal));
//        addItem.setEnabled(true);
    }//GEN-LAST:event_dataFocusGained

    private void dataFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataFocusLost
//        double valorFinal;
//        valorFinal = Double.parseDouble(valorItem.getText()) * Integer.parseInt(qtd.getText());
//        
//        //O valor da compra total recebe o valor vezes a quantidade de itens 
//        //valorTotal.setText(String.valueOf(valorFinal));
    }//GEN-LAST:event_dataFocusLost

    private void qtdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_qtdFocusLost
        double valorFinal;
        valorFinal = Double.parseDouble(valorItem.getText()) * Integer.parseInt(qtd.getText());
        
        //O valor da compra total recebe o valor vezes a quantidade de itens 
        valorTotal.setText(String.valueOf(totalCompra));
    }//GEN-LAST:event_qtdFocusLost

    private void tabelindaComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelindaComprasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelindaComprasMouseClicked

    private void addItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemActionPerformed
        try{
            modelo.setNomeProduto(nomeProduto.getText());
            modelo.setQtdItem(Integer.parseInt(qtd.getText()));
            modelo.setIdVenda(codigoVenda);
            controle.adicionaItem(modelo);
            totalCompra = totalCompra + Double.parseDouble(valorItem.getText()) * Integer.parseInt(qtd.getText());
            valorTotal.setText(String.valueOf(totalCompra));
        }catch(NumberFormatException ex){ 
            JOptionPane.showMessageDialog(rootPane, "Erro no Cadastro! Formatação errada!\n\n"+ex);
        }
        if(nomeProduto.getText().equals("") || qtd.getText().equals("") || data.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Erro! Nenhum dos campos pode estar vazio!");
        }else{
            nomeProduto.setEnabled(true);
            nomeProduto.setText("");
            buscarProduto.setEnabled(true);
            data.setEnabled(false);
            //Atualiza tabela de compras com as relações entre produtos e venda
            preencherTabelaItensComprados("select * from produtos_mercado inner join itens_venda_produto on produtos_mercado.id_produto = itens_venda_produto.id_produto inner join venda_mercado on venda_mercado.id_venda = itens_venda_produto.id_venda where venda_mercado.id_venda ="+codigoVenda);
//            try{
//                PreparedStatement pst = conexao.connect.prepareStatement("insert intovenda_mercado (data_venda,valor_venda)values(?,?)");
//                try {
//                    pst.setString(1, data.getText());
//                    pst.setDouble(2, Double.parseDouble(valorTotal.getText()));
//                } catch (NumberFormatException ex) {
//                    JOptionPane.showMessageDialog(rootPane, ex);
//                }
//            }catch(SQLException ex){
//                JOptionPane.showMessageDialog(rootPane, ex);
//            }
            confirmarVenda.setEnabled(true);
        }  
    }//GEN-LAST:event_addItemActionPerformed

    private void dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataActionPerformed

    //Preenche a tabela quando o usuário clica em buscar
    public void preencherTabelaProdutosLista(String sql){
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"Código","Produto","Preço"};
        conexao.conexaoBanco();
        conexao.executaSQL(sql);            
        try {
            conexao.rs.first();
            do{
                dados.add(new Object[]{conexao.rs.getInt("id_produto"), conexao.rs.getString("nome_produto"), conexao.rs.getDouble("valor_venda")});
            }while(conexao.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher a tabela!\nErro: "+ex);
        }
        
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        tabelinda.setModel(modelo);
        //Código
        tabelinda.getColumnModel().getColumn(0).setPreferredWidth(300); //Tamanho
        tabelinda.getColumnModel().getColumn(0).setResizable(false); //Não pode aumentar o tamanho com o mouse
        //Produto
        tabelinda.getColumnModel().getColumn(1).setPreferredWidth(308); //Tamanho
        tabelinda.getColumnModel().getColumn(1).setResizable(false); //Não pode aumentar o tamanho com o mouse
        //Preço
        tabelinda.getColumnModel().getColumn(2).setPreferredWidth(308); //Tamanho
        tabelinda.getColumnModel().getColumn(2).setResizable(false); //Não pode aumentar o tamanho com o mouse
        //Cabeçalho da tabela
        tabelinda.getTableHeader().setReorderingAllowed(false);//Não pode reordenar a posição
        tabelinda.setAutoResizeMode(tabelinda.AUTO_RESIZE_OFF); //Não pode ser redimensionada
        tabelinda.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   
    }
    
    //Preencha a tabela com o histórico de compras
//    public void preencherTabelaHistorico(String sql){
//        ArrayList dados = new ArrayList();
//        String[] Colunas = new String[]{"Data da Venda","ID","Valor da Venda"};
//        conexao.conexaoBanco();
//        conexao.executaSQL(sql);            
//        try {
//            conexao.rs.first();
//            do{
//                dados.add(new Object[]{conexao.rs.getInt("data_venda"), codigoVenda, conexao.rs.getDouble("valor_venda")});
//            }while(conexao.rs.next());
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher a tabela!\n "+ex);
//        }
//        
//        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
//        tabelindaLista.setModel(modelo);
//        //Data
//        tabelindaLista.getColumnModel().getColumn(0).setPreferredWidth(300); //Tamanho
//        tabelindaLista.getColumnModel().getColumn(0).setResizable(false); //Não pode aumentar o tamanho com o mouse
//        //ID
//        tabelindaLista.getColumnModel().getColumn(1).setPreferredWidth(308); //Tamanho
//        tabelindaLista.getColumnModel().getColumn(1).setResizable(false); //Não pode aumentar o tamanho com o mouse
//        //Preço
//        tabelindaLista.getColumnModel().getColumn(2).setPreferredWidth(308); //Tamanho
//        tabelinda.getColumnModel().getColumn(2).setResizable(false); //Não pode aumentar o tamanho com o mouse
//        //Cabeçalho da tabela
//        tabelindaLista.getTableHeader().setReorderingAllowed(false);//Não pode reordenar a posição
//        tabelindaLista.setAutoResizeMode(tabelinda.AUTO_RESIZE_OFF); //Não pode ser redimensionada
//        tabelindaLista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   
//    }
//    
//    
//Preenche a tabela de itens no carrinho de compras
    public void preencherTabelaItensComprados(String sql){
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"Produto","Quantidade","Preço Final"};
        conexao.conexaoBanco();
        conexao.executaSQL(sql);            
        try {
            conexao.rs.first();
            do{
                double valorProduto = conexao.rs.getDouble("valor_venda");
                int qtdVendida = conexao.rs.getInt("qtd_produto");
                dados.add(new Object[]{conexao.rs.getString("nome_produto"), conexao.rs.getInt("qtd_produto"), qtdVendida*valorProduto});
            }while(conexao.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher a tabela!\nErro: "+ex);
        }
        
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        tabelindaCompras.setModel(modelo);
        //Produto
        tabelindaCompras.getColumnModel().getColumn(0).setPreferredWidth(300); //Tamanho
        tabelindaCompras.getColumnModel().getColumn(0).setResizable(false); //Não pode aumentar o tamanho com o mouse
        //Quantidade
        tabelindaCompras.getColumnModel().getColumn(1).setPreferredWidth(308); //Tamanho
        tabelindaCompras.getColumnModel().getColumn(1).setResizable(false); //Não pode aumentar o tamanho com o mouse
        //Preço Final
        tabelindaCompras.getColumnModel().getColumn(2).setPreferredWidth(308); //Tamanho
        tabelindaCompras.getColumnModel().getColumn(2).setResizable(false); //Não pode aumentar o tamanho com o mouse
        //Cabeçalho da tabela
        tabelindaCompras.getTableHeader().setReorderingAllowed(false);//Não pode reordenar a posição
        tabelindaCompras.setAutoResizeMode(tabelinda.AUTO_RESIZE_OFF); //Não pode ser redimensionada
        tabelindaCompras.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//        somarItensCarrinho();
    }
    
//    public void somarItensCarrinho(){
//        conexao.executaSQL("select * from itens_venda_produto inner join produtos_mercado on itens_venda_produto.id_produto = produtos_mercado.id_produto where id_venda="+codigoVenda);
//        try {
//            conexao.rs.first();
//            while(conexao.rs.next()){
//                totalCompra += conexao.rs.getDouble("valor_venda") * conexao.rs.getInt("qtd_produto");
//            }
//            valorTotal.setText(String.valueOf(totalCompra));
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null,"Erro na soma dos produtos!\n"+ ex);
//        }
//    }
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
            java.util.logging.Logger.getLogger(CriarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CriarVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItem;
    private javax.swing.JButton buscarProduto;
    private javax.swing.JButton confirmarVenda;
    private javax.swing.JFormattedTextField data;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField nomeProduto;
    private javax.swing.JButton novo;
    private javax.swing.JTextField qtd;
    private javax.swing.JButton retorno;
    private javax.swing.JTable tabelinda;
    private javax.swing.JTable tabelindaCompras;
    private javax.swing.JTextField valorItem;
    private javax.swing.JTextField valorTotal;
    // End of variables declaration//GEN-END:variables
}
