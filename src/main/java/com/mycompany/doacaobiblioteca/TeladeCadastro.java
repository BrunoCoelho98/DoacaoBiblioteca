/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.doacaobiblioteca;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Bruno Coelho
 */
public class TeladeCadastro extends javax.swing.JFrame {

    /**
     * Creates new form TeladeCadastro
     */
    
    ArrayList<LivroDoado> listaDeLivros;
    int registroAtual;
    
    public TeladeCadastro() {
        initComponents();
        listaDeLivros = new ArrayList<>();
        registroAtual = -1;        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfISBN = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfTitulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfDataDoacao = new javax.swing.JTextField();
        tfNomeDoador = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfAutor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfCPFDoador = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfAnoPublicacao = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfCategoria = new javax.swing.JTextField();
        tfDataExpedicao = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbCondicao = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cbExpedido = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        tfRegistroAtual = new javax.swing.JTextField();
        btSalvar = new javax.swing.JToggleButton();
        btExcluir = new javax.swing.JToggleButton();
        btVoltar = new javax.swing.JToggleButton();
        btAvancar = new javax.swing.JToggleButton();
        btRelatorios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(720, 600));
        setPreferredSize(new java.awt.Dimension(600, 500));
        setSize(new java.awt.Dimension(550, 300));

        jLabel1.setText("Título");

        tfISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfISBNActionPerformed(evt);
            }
        });

        jLabel2.setText("ISBN");

        tfTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTituloActionPerformed(evt);
            }
        });

        jLabel3.setText("Data de doação");

        jLabel5.setText("Nome do Doador");

        jLabel6.setText("Autor");

        jLabel7.setText("CPF Doador");

        tfCPFDoador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCPFDoadorActionPerformed(evt);
            }
        });

        jLabel8.setText("Ano de Publicação");

        jLabel9.setText("Categoria");

        jLabel10.setText("Condição do livro");

        jLabel11.setText("Data de expedição");

        cbCondicao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Novo", "Seminovo", "Usado", "Danificado" }));
        cbCondicao.setToolTipText("");

        jLabel12.setText("Expedido para");

        cbExpedido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Campus 1", "Campus 2", "Campus 3" }));
        cbExpedido.setSelectedIndex(1);

        jLabel13.setText("Registro");

        tfRegistroAtual.setText("0");

        btSalvar.setText("Salvar");
        btSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSalvarMouseClicked(evt);
            }
        });
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btExcluirMouseClicked(evt);
            }
        });

        btVoltar.setText("<< Voltar");
        btVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btVoltarMouseClicked(evt);
            }
        });

        btAvancar.setText("Avançar >>");
        btAvancar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAvancarMouseClicked(evt);
            }
        });

        btRelatorios.setText("Relatorios");
        btRelatorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btRelatoriosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tfNomeDoador, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfISBN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfTitulo)
                        .addComponent(tfDataDoacao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfCPFDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btExcluir))
                    .addComponent(btRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cbCondicao, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel12))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cbExpedido, javax.swing.GroupLayout.Alignment.LEADING, 0, 148, Short.MAX_VALUE)
                                    .addComponent(tfDataExpedicao)
                                    .addComponent(tfCategoria))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(183, 183, 183))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(tfAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfRegistroAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(tfAnoPublicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAnoPublicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfDataExpedicao, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfDataDoacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNomeDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbExpedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCPFDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCondicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(tfRegistroAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btVoltar)
                            .addComponent(btAvancar)
                            .addComponent(btRelatorios))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btSalvar)
                            .addComponent(btExcluir))
                        .addContainerGap(208, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfISBNActionPerformed

    private void tfTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTituloActionPerformed

    private void tfCPFDoadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCPFDoadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCPFDoadorActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalvarMouseClicked
    
        
        // checa se os campos foram digitados
        if (tfAutor.getText().isEmpty() || tfAnoPublicacao.getText().isEmpty() ||
        tfCPFDoador.getText().isEmpty() || tfCategoria.getText().isEmpty() ||
        tfDataDoacao.getText().isEmpty() || tfISBN.getText().isEmpty() ||
        tfNomeDoador.getText().isEmpty() || tfTitulo.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Não é possível gravar.\nUm dos campos está vazio.");
    } else {
            //Cria um novo livro
        Doador doador = new Doador(tfNomeDoador.getText(), tfCPFDoador.getText());
        LivroDoado livro = new LivroDoado(doador, tfTitulo.getText(),
                                          tfAutor.getText(),
                                          Integer.parseInt(tfISBN.getText()),
                                          tfCategoria.getText(),
                                          Integer.parseInt(tfAnoPublicacao.getText()),
                                          (String) cbCondicao.getSelectedItem(),
                                          tfDataDoacao.getText());
        livro.expedir(tfDataExpedicao.getText(), (String) cbExpedido.getSelectedItem());

       // Se estiver no último registro, adiciona um novo livro.
        if (registroAtual == listaDeLivros.size()) {
            listaDeLivros.add(livro);
        } else {
            // Atualizar os campos do livro existente no índice atual
            listaDeLivros.get(registroAtual).setTitulo(tfTitulo.getText());
            listaDeLivros.get(registroAtual).setAutor(tfAutor.getText());
            listaDeLivros.get(registroAtual).setIsbn(Integer.parseInt(tfISBN.getText()));
            listaDeLivros.get(registroAtual).setCategoria(tfCategoria.getText());
            listaDeLivros.get(registroAtual).setAnoPublicacao(Integer.parseInt(tfAnoPublicacao.getText()));
            listaDeLivros.get(registroAtual).setCondicao((String) cbCondicao.getSelectedItem());
            listaDeLivros.get(registroAtual).setDataDoacao(tfDataDoacao.getText());
            listaDeLivros.get(registroAtual).getDoador().setNome(tfNomeDoador.getText());
            listaDeLivros.get(registroAtual).getDoador().setCPF(tfCPFDoador.getText());
            listaDeLivros.get(registroAtual).expedir(tfDataExpedicao.getText(), (String) cbExpedido.getSelectedItem());
        }

        registroAtual = listaDeLivros.size() - 1;

        // Atualiza a tela, limpando os campos
        atualizarTela(-1);
        
        // Salvar a lista após a atualização
        salvarLista();
    }


    }//GEN-LAST:event_btSalvarMouseClicked

    private void btExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExcluirMouseClicked
        if (!listaDeLivros.isEmpty()){
            listaDeLivros.remove(registroAtual);
            if(listaDeLivros.size() == registroAtual){
                registroAtual--;
                atualizarTela(registroAtual);
            } else {
                atualizarTela(registroAtual);
            }
        }
        else{
            atualizarTela(-1);
        }
        salvarLista();
    }//GEN-LAST:event_btExcluirMouseClicked

    private void btVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btVoltarMouseClicked
        if (!listaDeLivros.isEmpty() && registroAtual > 0){
            registroAtual--;
        }
        atualizarTela(registroAtual);
    }//GEN-LAST:event_btVoltarMouseClicked

    private void btAvancarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAvancarMouseClicked
        if (!listaDeLivros.isEmpty() && registroAtual < listaDeLivros.size() -1){
            registroAtual++;
            atualizarTela(registroAtual);
        } else if (!listaDeLivros.isEmpty() && registroAtual == listaDeLivros.size() -1){
            registroAtual++;
            limparCampos();
        }
    }//GEN-LAST:event_btAvancarMouseClicked

    private void btRelatoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btRelatoriosMouseClicked
        TeladeRelatorio telaRelatorio = new TeladeRelatorio(this);
        telaRelatorio.setVisible(true);
        telaRelatorio.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btRelatoriosMouseClicked
    
    private void limparCampos() {
    tfTitulo.setText("");
    tfAutor.setText("");
    tfISBN.setText("");
    tfCategoria.setText("");
    tfAnoPublicacao.setText("");
    tfDataDoacao.setText("");
    tfDataExpedicao.setText("");
    tfNomeDoador.setText("");
    tfCPFDoador.setText("");
    cbCondicao.setSelectedIndex(0);
    cbExpedido.setSelectedIndex(1);
}

    
    private void carregarLista() {
    try {
        FileInputStream fis = new FileInputStream("listadelivros.bin");
        try (ObjectInputStream ois = new ObjectInputStream(fis)) {
            listaDeLivros = (ArrayList <LivroDoado>) ois.readObject();
        }
        fis.close();
        registroAtual = 0;
        atualizarTela(registroAtual);
    } catch (FileNotFoundException | ClassNotFoundException ex) {
        Logger.getLogger(TeladeCadastro.class.getName()).log(Level.SEVERE, null, ex);
        // Adicione um JOptionPane ou outro método para informar o usuário sobre o erro
    } catch (IOException ex) {
        Logger.getLogger(TeladeCadastro.class.getName()).log(Level.SEVERE, null, ex);
        // Adicione um JOptionPane ou outro método para informar o usuário sobre o erro
    }
}

    
    private void salvarLista(){
        try {
            FileOutputStream fos;
            fos = new FileOutputStream("listadelivros.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listaDeLivros);
            oos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TeladeCadastro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TeladeCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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
            java.util.logging.Logger.getLogger(TeladeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeladeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeladeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeladeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                TeladeCadastro telaCadastro = new TeladeCadastro();
                telaCadastro.setVisible(true);
                telaCadastro.carregarLista();
                telaCadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
    }
    
    public ArrayList<LivroDoado> getListaDeLivros() {
        return listaDeLivros;
    }
    
    private void atualizarTela(int registro){
        if ( registro >= 0 )
        {
            LivroDoado livro = listaDeLivros.get(registro);
            tfTitulo.setText(livro.getTitulo());
            tfAutor.setText(livro.getAutor());
            tfISBN.setText(Integer.toString(livro.getIsbn()));
            tfCategoria.setText(livro.getCategoria());
            tfAnoPublicacao.setText(Integer.toString(livro.getAnoPublicacao()));
            tfRegistroAtual.setText(Integer.toString(registro + 1));
            tfNomeDoador.setText(livro.getDoador().getNome());
            tfCPFDoador.setText(livro.getDoador().getCPF());
            cbCondicao.setSelectedItem(livro.getCondicao());
            tfDataDoacao.setText(livro.getDataDoacao());
            tfDataExpedicao.setText(livro.getDataExpedicao());
            cbExpedido.setSelectedIndex(1);
        }
        else 
        {
            tfTitulo.setText(null);
            tfAutor.setText(null);
            tfISBN.setText(null);
            tfCategoria.setText(null);
            tfAnoPublicacao.setText(null);
            tfRegistroAtual.setText(null);  
            tfNomeDoador.setText(null);
            tfCPFDoador.setText(null);
            tfDataDoacao.setText(null);
            tfDataExpedicao.setText(null);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btAvancar;
    private javax.swing.JToggleButton btExcluir;
    private javax.swing.JButton btRelatorios;
    private javax.swing.JToggleButton btSalvar;
    private javax.swing.JToggleButton btVoltar;
    private javax.swing.JComboBox<String> cbCondicao;
    private javax.swing.JComboBox<String> cbExpedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tfAnoPublicacao;
    private javax.swing.JTextField tfAutor;
    private javax.swing.JTextField tfCPFDoador;
    private javax.swing.JTextField tfCategoria;
    private javax.swing.JTextField tfDataDoacao;
    private javax.swing.JTextField tfDataExpedicao;
    private javax.swing.JTextField tfISBN;
    private javax.swing.JTextField tfNomeDoador;
    private javax.swing.JTextField tfRegistroAtual;
    private javax.swing.JTextField tfTitulo;
    // End of variables declaration//GEN-END:variables
}
