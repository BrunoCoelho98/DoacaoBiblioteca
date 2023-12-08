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
public class Livro implements Serializable {
    
    private String titulo;
    private String autor;
    private int isbn;
    private String categoria;
    private int anoPublicacao;
    private String condicao;
    private Expedicao expedicao;

    public Livro(String titulo, String autor, int isbn, String categoria, int anoPublicacao, String condicao) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.categoria = categoria;
        this.anoPublicacao = anoPublicacao;
        this.condicao = condicao;        
    }

    public String getLocal() {
        return this.expedicao.getLocal();
    }
    
    public String getDataExpedicao(){
        return this.expedicao.getData();
    }
   
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }
    
    public void expedir(String data, String local){
        this.expedicao = new Expedicao(this, data, local);
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void setExpedicao(Expedicao expedicao) {
        this.expedicao = expedicao;
    }
    
    

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", categoria=" + categoria + ", anoPublicacao=" + anoPublicacao + ", condicao=" + condicao + ", expedicao=" + expedicao;
    }
    
    
    
}
