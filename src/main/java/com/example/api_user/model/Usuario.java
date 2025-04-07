package com.example.api_user.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @OneToOne(cascade = CascadeType.ALL) // cascade = Indica que as operações de persistência (como salvar ou excluir) realizadas no objeto Usuario também serão aplicadas ao objeto Profile associado a ele.
    @JoinColumn(name = "profile_id", referencedColumnName = "id") // profile_id é o nome da coluna que será criada na tabela Usuario e referencedColumnName é o nome da coluna que será referenciada na tabela Profile
    private Profile profile;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
