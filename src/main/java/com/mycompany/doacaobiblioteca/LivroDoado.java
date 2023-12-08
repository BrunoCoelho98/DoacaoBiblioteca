/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.doacaobiblioteca;

import java.io.Serializable;

/**
 *
 * @author Bruno Coelho
 */
public class LivroDoado extends Livro implements Serializable {
    private Doador doador;
    private String dataDoacao;

    public LivroDoado(Doador doador, String titulo, String autor, int isbn, String categoria, int anoPublicacao, String condicao, String dataDoacao) {
        super(titulo, autor, isbn, categoria, anoPublicacao, condicao);
        this.doador = doador;
        this.dataDoacao = dataDoacao;
    }

    public Doador getDoador() {
        return doador;
    }

    public String getDataDoacao() {
        return dataDoacao;
    }

    @Override
    public String toString() {
        return super.toString() + "doador=" + doador + ", dataDoacao=" + dataDoacao + '}';
    }

    public void setDoador(Doador doador) {
        this.doador = doador;
    }

    public void setDataDoacao(String dataDoacao) {
        this.dataDoacao = dataDoacao;
    }

    
    
}
