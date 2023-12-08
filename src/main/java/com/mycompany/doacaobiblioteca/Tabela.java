/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.doacaobiblioteca;

/**
 *
 * @author zexxed
 */
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class Tabela extends AbstractTableModel {
    private final String[] colunas = {"ISBN", "Título", "Autor", "Categoria", "Doador", "Campus", "Data de Doação", "Data de Expedição"};
    private TeladeCadastro telaCadastro;
    private ArrayList<LivroDoado> listaDeLivros;
    
    public Tabela(TeladeCadastro telaCadastro){
        this.telaCadastro = telaCadastro;
        this.listaDeLivros = telaCadastro.getListaDeLivros();
    }
    @Override
    public int getRowCount() {
        return listaDeLivros.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        LivroDoado livro = listaDeLivros.get(rowIndex);
        switch (columnIndex) {
            case 0: return livro.getIsbn();
            case 1: return livro.getTitulo();
            case 2: return livro.getAutor();
            case 3: return livro.getCategoria();
            case 4: return livro.getDoador().getNome();
            case 5: return livro.getLocal(); // Supondo que o local seja o Campus
            case 6: return livro.getDataDoacao();
            case 7: return livro.getDataExpedicao();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
}

