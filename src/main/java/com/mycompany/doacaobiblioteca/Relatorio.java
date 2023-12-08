/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.doacaobiblioteca;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bruno Coelho
 */
public class Relatorio extends javax.swing.JFrame {

    /**
     * Creates new form Relatorio
     */
    private TeladeCadastro telaCadastro;
    private ArrayList<LivroDoado> listaDeLivros;
    private String filtro;
    private int obj;
   
    public Relatorio(String filtro, int obj, TeladeCadastro telaCadastro) {
        initComponents();
        this.telaCadastro = telaCadastro;
        this.listaDeLivros = telaCadastro.getListaDeLivros();
        this.filtro = filtro;
        this.obj = obj;
        System.out.println(obj);
        System.out.println(filtro);
        switch(obj){
            case 0:
                imprimirPorDoador(filtro);
                break;
            case 1:
                imprimirPorDataDoacao(filtro);
                break;
            case 2:
                imprimirPorDataExpedicao(filtro);
                break;
            case 3:
                imprimirPorCampus(filtro);
                break;
            case 4:
                imprimirPorCondicao(filtro);
                break;
            case 5:
                imprimirPorAutor(filtro);
                break;
            case 6:
                imprimirPorCategoria(filtro);
                break;
        }
    }
    
    private void imprimirPorDoador(String doador) {
    DefaultTableModel dtmRelatorio = (DefaultTableModel) jtRelatorio.getModel();
    for (LivroDoado livro : listaDeLivros) {
        if (livro.getDoador().getNome().equalsIgnoreCase(doador)  || livro.getDoador().getCPF().equalsIgnoreCase(doador)){
            Object[] dados = {livro.getIsbn(), livro.getTitulo(), livro.getAutor(), livro.getCategoria(),
                        livro.getCondicao(), livro.getDoador().getNome(), livro.getLocal(),
                        livro.getDataDoacao(), livro.getDataExpedicao()};
            dtmRelatorio.addRow(dados);
        }
    }
}
    public void imprimirPorDataDoacao(String data){
    DefaultTableModel dtmRelatorio = (DefaultTableModel) jtRelatorio.getModel();
    for (LivroDoado livro : listaDeLivros) {
        if (livro.getDataDoacao().equalsIgnoreCase(data)){
            Object[] dados = {livro.getIsbn(), livro.getTitulo(), livro.getAutor(), livro.getCategoria(),
                        livro.getCondicao(), livro.getDoador().getNome(), livro.getLocal(),
                        livro.getDataDoacao(), livro.getDataExpedicao()};
            dtmRelatorio.addRow(dados);
        }
    }
}
    
    public void imprimirPorDataExpedicao(String data){
    jtRelatorio.removeAll();
    DefaultTableModel dtmRelatorio = (DefaultTableModel) jtRelatorio.getModel();
    for (LivroDoado livro : listaDeLivros) {
        if (livro.getDataExpedicao().equalsIgnoreCase(data)){
            Object[] dados = {livro.getIsbn(), livro.getTitulo(), livro.getAutor(), livro.getCategoria(),
                        livro.getCondicao(), livro.getDoador().getNome(), livro.getLocal(),
                        livro.getDataDoacao(), livro.getDataExpedicao()};
            dtmRelatorio.addRow(dados);

        }
    }
}
    
    public void imprimirPorCampus(String data){
    DefaultTableModel dtmRelatorio = (DefaultTableModel) jtRelatorio.getModel();
    for (LivroDoado livro : listaDeLivros) {
        if (livro.getLocal().equalsIgnoreCase(data)){
            Object[] dados = {livro.getIsbn(), livro.getTitulo(), livro.getAutor(), livro.getCategoria(),
                        livro.getCondicao(), livro.getDoador().getNome(), livro.getLocal(),
                        livro.getDataDoacao(), livro.getDataExpedicao()};
            dtmRelatorio.addRow(dados);
        }
    }
}
    
public void imprimirPorCondicao(String condicao){
    DefaultTableModel dtmRelatorio = (DefaultTableModel) jtRelatorio.getModel();
    for (LivroDoado livro : listaDeLivros) {
        if (livro.getCondicao().equalsIgnoreCase(condicao)){
            Object[] dados = {livro.getIsbn(), livro.getTitulo(), livro.getAutor(), livro.getCategoria(),
                        livro.getCondicao(), livro.getDoador().getNome(), livro.getLocal(),
                        livro.getDataDoacao(), livro.getDataExpedicao()};
            dtmRelatorio.addRow(dados);
        }
    }
}

public void imprimirPorAutor(String autor){
    DefaultTableModel dtmRelatorio = (DefaultTableModel) jtRelatorio.getModel();
    for (LivroDoado livro : listaDeLivros) {
        if (livro.getAutor().equalsIgnoreCase(autor)){
            Object[] dados = {livro.getIsbn(), livro.getTitulo(), livro.getAutor(), livro.getCategoria(),
                        livro.getCondicao(), livro.getDoador().getNome(), livro.getLocal(),
                        livro.getDataDoacao(), livro.getDataExpedicao()};
            dtmRelatorio.addRow(dados);
        }
    }
}

public void imprimirPorCategoria(String categoria){
    DefaultTableModel dtmRelatorio = (DefaultTableModel) jtRelatorio.getModel();
    for (LivroDoado livro : listaDeLivros) {
        if (livro.getCategoria().equalsIgnoreCase(categoria)){
            Object[] dados = {livro.getIsbn(), livro.getTitulo(), livro.getAutor(), livro.getCategoria(),
                        livro.getCondicao(), livro.getDoador().getNome(), livro.getLocal(),
                        livro.getDataDoacao(), livro.getDataExpedicao()};
            dtmRelatorio.addRow(dados);
        }
    }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jtRelatorio = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "Título", "Autor", "Categoria", "Condição", "Doador", "Campus", "Data de Doação", "Data de Expedição"
            }
        ));
        jScrollPane2.setViewportView(jtRelatorio);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 779, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(7, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtRelatorio;
    // End of variables declaration//GEN-END:variables
}
