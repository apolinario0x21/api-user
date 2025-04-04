package com.example.api_user.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity // Indica que essa classe é uma entidade do banco de dados
public class Produto {
    @Id // Indica que esse campo é a chave primária da entidade
    @GeneratedValue // Indica que o valor desse campo será gerado automaticamente
    private Long id;
    private String nome;
    private double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
