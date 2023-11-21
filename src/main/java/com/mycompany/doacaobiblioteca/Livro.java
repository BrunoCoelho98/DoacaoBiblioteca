/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.doacaobiblioteca;

/**
 *
 * @author bruno
 */
public class Livro {
    private String nome;
    private String autor;
    private int isbn;
    private String categoria;
    private int anoPublicacao;

    public Livro(String nome, String autor, int isbn, String categoria, int anoPublicacao) {
        this.nome = nome;
        this.autor = autor;
        this.isbn = isbn;
        this.categoria = categoria;
        this.anoPublicacao = anoPublicacao;
    }

    public String getNome() {
        return nome;
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
    
    
    
    
    
    
    
}
