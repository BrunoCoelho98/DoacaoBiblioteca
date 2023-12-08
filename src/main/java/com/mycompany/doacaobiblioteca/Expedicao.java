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
public class Expedicao implements Serializable{
    private Livro livro;
    private String data;
    private String local;

    public Expedicao(Livro livro, String data, String local) {
        this.livro = livro;
        this.data = data;
        this.local = local;
    }

    public Livro getLivro() {
        return livro;
    }

    public String getData() {
        return data;
    }

    public String getLocal() {
        return local;
    }
    
}
